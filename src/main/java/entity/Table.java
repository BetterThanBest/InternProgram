package entity;

public class Table {
	private String parameterName;
	private String type;
	private String length;
	private String primaryKey;
	private String foreignKey;
	public Table(String parameterName, String type, String length, String primaryKey, String foreignKey) {
		this.parameterName = parameterName;
		this.type = type;
		this.length = length;
		this.primaryKey = primaryKey;
		this.foreignKey = foreignKey;
	}
	public String getParameterName() {
		return parameterName;
	}
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
	public String getForeignKey() {
		return foreignKey;
	}
	public void setForeignKey(String foreignKey) {
		this.foreignKey = foreignKey;
	}
	public Table() {
	}
	
	
}
