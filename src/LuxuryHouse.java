public class LuxuryHouse extends House {
    public LuxuryHouse(WallMaterial wallMaterial) {
        super(wallMaterial);
    }
    @Override
    public void build() {
        System.out.println("Luxury house:");
        wallMaterial.buildWalls();
    }
}
