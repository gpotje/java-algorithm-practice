package org.example.java.N9.modelagem_objetos_responsabilidade.ex73;

public class VintageFilter implements ImageFilter{
    @Override
    public String applyFilter(String imageName) {
        System.out.println("Aplicando filtro Vintage na imagem: "+imageName);
        return "vintage_" + imageName;
    }
}
