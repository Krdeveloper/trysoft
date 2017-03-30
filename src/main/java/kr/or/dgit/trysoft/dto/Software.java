package kr.or.dgit.trysoft.dto;

public class Software {
	private String swNo;
	private String swGroup;
	private String swName;
	private int swSupplyPrice;
	private int swPrice;
	private String supplyComp;
	
	public Software() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Software(String swNo, String swGroup, String swName, int swSupplyPrice, int swPrice, String supplyComp) {
		super();
		this.swNo = swNo;
		this.swGroup = swGroup;
		this.swName = swName;
		this.swSupplyPrice = swSupplyPrice;
		this.swPrice = swPrice;
		this.supplyComp = supplyComp;
	}

	public String getSwNo() {
		return swNo;
	}

	public void setSwNo(String swNo) {
		this.swNo = swNo;
	}

	public String getSwGroup() {
		return swGroup;
	}

	public void setSwGroup(String swGroup) {
		this.swGroup = swGroup;
	}

	public String getSwName() {
		return swName;
	}

	public void setSwName(String swName) {
		this.swName = swName;
	}

	public int getSwSupplyPrice() {
		return swSupplyPrice;
	}

	public void setSwSupplyPrice(int swSupplyPrice) {
		this.swSupplyPrice = swSupplyPrice;
	}

	public int getSwPrice() {
		return swPrice;
	}

	public void setSwPrice(int swPrice) {
		this.swPrice = swPrice;
	}

	public String getSupplyComp() {
		return supplyComp;
	}

	public void setSupplyComp(String supplyComp) {
		this.supplyComp = supplyComp;
	}

	@Override
	public String toString() {
		return String.format("Software [swNo=%s, swGroup=%s, swName=%s, swSupplyPrice=%s, swPrice=%s, supplyComp=%s]",
				swNo, swGroup, swName, swSupplyPrice, swPrice, supplyComp);
	}
	
	
	
	
}
