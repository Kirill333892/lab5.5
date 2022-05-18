package controller;

import entity.City;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashSet;
import java.util.Set;

public class Commands {
    private HashSet<City> cities = new HashSet<City>();

    public HashSet<City> getCities() {
        return cities;
    }

    public void setCities(HashSet<City> cities) {
        this.cities = cities;
    }

    public String help() {
        return "";
    }

    public String info() {
        return cities.getClass() + " " + cities.size();
    }

    public void show() {
        System.out.println(cities);
    }

    public void add(City city) {
        cities.add(city);
    }

    public void update(int id, City city) {

    }

    public void remove_by_id(int id) {
//        cities.remove();

    }

    public void clear() {
        cities.clear();
    }

    public void save(){
    }

    public void execute_script(String fileName) {

    }

    public void exit() {
        System.out.println("Closing without saving...");
        System.exit(0);
    }

    public void add_if_max(City city) {

    }

    public void add_if_min(City city) {

    }

    public void remove_greater(City city) {

    }

    public int sum_of_car_code() {
        return 12;
    }

    public void print_ascending() {

    }

    public void print_field_descending_governor() {

    }

    public Set validateCity(City city) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

//        for (ConstraintViolation<City> violation : violations) {
//            System.out.println(violation.getMessage());
//        }

        return validator.validate(city);
    }
}
