package lesson31.main;

public class Vehicle {     //Vehicleクラス（carクラスとbicycleクラスの親クラス）
	
	//ownerフィールドの値をセット
	private String owner;   //インスタンス生成時の所有者部分
	
	public String getOwner() {   //所有者のゲッターをセット
		return owner;
	}
	
	public void setOwner(String owner) { //所有者のセッターをセット
		this.owner =owner;
	}

}
