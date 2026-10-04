public class SmartHouse extends House {
    public SmartHouse(WallMaterial wallMaterial) {
        super(wallMaterial);
    }
    @Override
    public void build() {
        System.out.println("Smart house:");
        wallMaterial.buildWalls();
    }
}
