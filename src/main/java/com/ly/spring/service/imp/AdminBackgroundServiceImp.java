package com.ly.spring.service.imp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.ly.spring.dao.BackgroundDao;
import com.ly.spring.entity.Background;
import com.ly.spring.service.AdminBackgroundService;

import org.springframework.data.jpa.domain.Specification;

@Service
public class AdminBackgroundServiceImp implements AdminBackgroundService {
	@Autowired
	private BackgroundDao backgroundDao;

	private Specification<Background> getWhere(final Background background) {

		return new Specification<Background>() {

			
			@Override
			public Predicate toPredicate(Root<Background> root, CriteriaQuery<?> query,
					CriteriaBuilder criteriaBuilder) {
				// TODO Auto-generated method stub
				Predicate predicate = criteriaBuilder.conjunction();
				List<Expression<Boolean>> expressionsList = predicate.getExpressions();
				if (background.getB_name() != null && !"".equals(background.getB_name())) {
					expressionsList.add(criteriaBuilder.and((root.<String>get("b_name").in(background.getB_name()))));
				}
				if (background.getB_state() != null && !"".equals(background.getB_state())) {
					expressionsList.add(criteriaBuilder.and((root.<String>get("b_state").in(background.getB_state()))));
				}
				return predicate;
			}
		};

	}

	@Override
	public Map<String, Object> getAdminBackground(Integer page, Integer limit, Background background) {
		// TODO Auto-generated method stub
		PageRequest pageRequest = PageRequest.of((page-1), limit);
		Page<Background> findAll = backgroundDao.findAll(getWhere(background), pageRequest);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("data", findAll.get());
		map.put("count", findAll.getTotalElements());
		return map;
	}

}
