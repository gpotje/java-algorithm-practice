package org.example.java.N9.modelagem_objetos_responsabilidade.ex73;

public class ImageProcessor {
    private ImageFilter imageFilter;

    public ImageProcessor(ImageFilter imageFilter) {
        this.imageFilter = imageFilter;
    }

    public String process(String imageName){
        return imageFilter.applyFilter(imageName);
    }
}
