import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            Build_Materials s = new Santehnic(360,"Bosh","washbasins", "kitchen");
            Build_Materials b = new Santehnic(100, "Bosh", "washbasins", "bathroom");
            Build_Materials u = new Santehnic(436.2, "Bosh", "bath", "bathroom");
        ArrayList<Build_Materials> build_materials = new ArrayList<>();
        build_materials.add(s);
        build_materials.add(b);
        build_materials.add(u);
        for(int i=0; i<build_materials.size(); i++){
            build_materials.get(i).Search(350);
        }


    }
}
