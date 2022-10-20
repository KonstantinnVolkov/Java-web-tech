package DAO;

import model.Appliance;

import java.util.List;

public interface IApplianceDAO {

    Appliance findCheapest();

    List<Appliance> findAllAppliancesByType(String type);
}
