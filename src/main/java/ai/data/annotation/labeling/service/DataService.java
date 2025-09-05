package ai.data.annotation.labeling.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ai.data.annotation.labeling.model.DataItem;
import ai.data.annotation.labeling.repository.DataRepository;

@Service
public class DataService {
	private final DataRepository repository;

	public DataService(DataRepository repository) {
		this.repository = repository;
	}

	public List<DataItem> getAll() {
		return repository.findAll();
	}

	public Optional<DataItem> getById(Long id) {
		return repository.findById(id);
	}

	public DataItem save(DataItem item) {
		return repository.save(item);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}