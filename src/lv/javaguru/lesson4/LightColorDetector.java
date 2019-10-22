package lv.javaguru.lesson4;

//Ok
public class LightColorDetector {
     public String detect(int waveLength){
         if (waveLength >= 380 && waveLength < 450) {
             return "Violet";
         } else if (waveLength >= 450 && waveLength < 495){
             return "Blue";
         } else if (waveLength >= 495 && waveLength < 570){
             return "Green";
         } else if (waveLength >= 570 && waveLength < 590){
             return "Yellow";
         } else if (waveLength >= 590 && waveLength < 620){
             return "Orange";
         } else if (waveLength >= 620 && waveLength < 750){
             return "Red";
         }else{
             return "The light we can't see";
         }
    }
}


