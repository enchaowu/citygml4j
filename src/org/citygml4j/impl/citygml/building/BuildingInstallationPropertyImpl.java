package org.citygml4j.impl.citygml.building;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.impl.gml.AssociationImpl;
import org.citygml4j.model.citygml.CityGMLClass;
import org.citygml4j.model.citygml.building.BuildingInstallation;
import org.citygml4j.model.citygml.building.BuildingInstallationProperty;
import org.citygml4j.model.module.citygml.BuildingModule;

public class BuildingInstallationPropertyImpl extends AssociationImpl<BuildingInstallation> implements BuildingInstallationProperty {
	private BuildingModule module;
	
	public BuildingInstallationPropertyImpl() {
		
	}
	
	public BuildingInstallationPropertyImpl(BuildingModule module) {
		this.module = module;
	}
	
	public BuildingInstallation getBuildingInstallation() {
		return super.getObject();
	}

	public boolean isSetBuildingInstallation() {
		return super.isSetObject();
	}

	public void setBuildingInstallation(BuildingInstallation buildingInstallation) {
		super.setObject(buildingInstallation);
	}

	public void unsetBuildingInstallation() {
		super.unsetObject();
	}

	public CityGMLClass getCityGMLClass() {
		return CityGMLClass.BUILDINGINSTALLATIONPROPERTY;
	}

	public final BuildingModule getCityGMLModule() {
		return module;
	}

	public boolean isSetCityGMLModule() {
		return module != null;
	}

	public Object copy(CopyBuilder copyBuilder) {
		return copyTo(new BuildingInstallationPropertyImpl(), copyBuilder);
	}

	@Override
	public Object copyTo(Object target, CopyBuilder copyBuilder) {
		BuildingInstallationProperty copy = (target == null) ? new BuildingInstallationPropertyImpl() : (BuildingInstallationProperty)target;
		return super.copyTo(copy, copyBuilder);
	}

}