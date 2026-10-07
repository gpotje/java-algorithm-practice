package org.example.java.N9.modelagem_objetos_responsabilidade.ex73;

public class GrayscaleFilter implements ImageFilter{
    @Override
    public String applyFilter(String imageName) {
        System.out.println("Aplicando filtro Preto e Branco na imagem:"+imageName);
        return "grayscale_" + imageName;
    }
}
