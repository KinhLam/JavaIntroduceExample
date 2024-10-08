package Assignment.ASM2.Lab_8;

class ImageProcessingException extends Exception{
    public ImageProcessingException(String s){
        super(s);
    }
}

class ImageProcessor{
    public void processImage(String imagePath) throws ImageProcessingException{
        if(imagePath==null || !imagePath.endsWith(".jpg")){
            throw new ImageProcessingException("Invalid image path");
        }
        System.out.println("Image processed successfully");
    }
}
public class Ex_23 {
    public static void main(String[] args) {
        ImageProcessor image = new ImageProcessor();
        try {
            image.processImage("hehe.png");
        }catch (ImageProcessingException e){
            System.out.println(e.getMessage());
        }
    }
}
