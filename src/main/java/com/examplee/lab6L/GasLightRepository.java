package com.examplee.lab6L;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class GasLightRepository implements JpaRepository<GasLight, Long> {
    // метод для знаходження літаку за його ID

    @Override
    public GasLight save(GasLight gasLight) {
        return null;  // код для створення нового літака
    }

    @Override
    public GasLight saveAndFlush(GasLight gasLight) {
        return null;  // код для оновлення інформації про існуючий літак
    }

    @Override
    public void deleteById(Long id) {
        // код для видалення літака за його ID

    }

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<GasLight> getAllGasLights() {
        String sql = "SELECT * FROM gaslights";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(GasLight.class));
    }

    public GasLight getGasLightById(Long id) {
        String sql = "SELECT * FROM planes WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(GasLight.class));
    }

    public void addPlane(GasLight gasLight) {
        String sql = "INSERT INTO planes (id, name, model, year) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, gasLight.getId(), gasLight.getName(), gasLight.getModel(), gasLight.getYear());
    }

    public void updateGasLight(Long id, GasLight gasLight) {
        String sql = "UPDATE planes SET name=?, model=?, year=? WHERE id=?";
        jdbcTemplate.update(sql, gasLight.getName(), gasLight.getModel(), gasLight.getYear(), id);
    }

    public void deleteGasLight(Long id) {
        String sql = "DELETE FROM planes WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public List<GasLight> findAll() {
        return null;
    }

    @Override
    public List<GasLight> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<GasLight> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<GasLight> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }



    @Override
    public void delete(GasLight entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends GasLight> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends GasLight> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<GasLight> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends GasLight> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<GasLight> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public GasLight getOne(Long aLong) {
        return null;
    }

    @Override
    public GasLight getById(Long aLong) {
        return null;
    }

    @Override
    public GasLight getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends GasLight> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends GasLight> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends GasLight> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends GasLight> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GasLight> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends GasLight> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends GasLight, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
