package com.ai.data.annotation.labeling.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ai.data.annotation.labeling.model.DataItem;
import com.ai.data.annotation.labeling.service.DataService;

@RestController
@RequestMapping("/api/data")
public class DataController {
	private final DataService service;

	public DataController(DataService service) {
		this.service = service;
	}

	@GetMapping
	public List<DataItem> getAll() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public DataItem getById(@PathVariable Long id) {
		return service.getById(id).orElse(null);
	}

	@PostMapping
	public DataItem create(@RequestBody DataItem item) {
		return service.save(item);
	}

	@PutMapping("/{id}")
	public DataItem update(@PathVariable Long id, @RequestBody DataItem item) {
		item.setId(id);
		return service.save(item);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}