package lv.javaguru.lesson4;

//Ok
public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(630);
        System.out.println("Color of the light is: " + result);

        //test
        LightColorDetectorTest test = new LightColorDetectorTest();
        test.shouldBeColorViolet();
        test.shouldBeColorBlue();
        test.shouldBeColorGreen();
        test.shouldBeColorYellow();
        test.shouldBeColorOrange();
        test.shouldBeColorRed();
        test.theLightWeCantSee();
    }
    public void shouldBeColorViolet(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(400);
        compareResult(result.equals("Violet"),"shouldBeColorViolet");
    }
    public void shouldBeColorBlue(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(460);
        compareResult(result.equals("Blue"),"shouldBeColorBlue");
    }
    public void shouldBeColorGreen(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(500);
        compareResult(result.equals("Green"),"shouldBeColorGreen");
    }
    public void shouldBeColorYellow(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(580);
        compareResult(result.equals("Yellow"),"shouldBeColorYellow");
    }
    public void shouldBeColorOrange(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(610);
        compareResult(result.equals("Orange"),"shouldBeColorOrange");
    }
    public void shouldBeColorRed(){
        LightColorDetector detector = new LightColorDetector();
        String result = detector.detect(700);
        compareResult(result.equals("Red"),"shouldBeColorRed");
    }
    public void theLightWeCantSee(){
    LightColorDetector detector = new LightColorDetector();
    String result = detector.detect(10);
    compareResult(result.equals("The light we can't see"),"theLightWeCantSee");
}


    void compareResult(boolean result, String testName){
        if(result){
            System.out.println(testName + " OK");
        }else{
            System.out.println(testName + " FAIL");
        }
    }
}
