public abstract class House {
    protected WallMaterial wallMaterial;
    public House(WallMaterial wallMaterial) {
        this.wallMaterial = wallMaterial;
    }
    public void setWallMaterial(WallMaterial wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public abstract void build();
}
