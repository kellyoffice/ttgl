package com.kellyqi.ttgl.model;

public class Role {
	public static final int FATHER = 1;
	public static final int MATHER = 2;
	public static final int HUSBAND =3;
	public static final int WIFE = 4;
	public static final int SON = 5;
	public static final int DAUGHTER = 6;
	public static final int I = 7;
	
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}