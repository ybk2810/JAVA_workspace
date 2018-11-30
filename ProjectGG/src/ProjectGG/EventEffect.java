package ProjectGG;

import java.awt.Image;

public class EventEffect {
	//igmAlbatross : Par5 -> 2번만에 홀인(-3)
	//igmHoleInOne : Par3 -> 한번에 홀인(-2)
	//igmEagle : Par4 -> 2번만에 홀인했을때 , Par5 -> 3번만에 홀인했을때(-2)
	//igmBirdie : Par3 -> 2번만에 홀인 , Par4 -> 3번만에 홀인 , Par5 -> 4번만에 홀인(-1)
	//igmPar : Par3 -> 3번만에 홀인 , Par4 -> 4번만에 홀인 , Par5 -> 5번만에 홀인(0)
	//igmBogey :  Par3 -> 4번만에 홀인 , Par4 -> 5번만에 홀인 , Par5 -> 6번만에 홀인(+1)
	//igmOB : 필드밖으로 나갔을때 OB했을땐 티샷위치에 다시 친다.(+2)
	//igmDoubleBogey : Par3 -> 5번만에 홀인 , Par4 -> 6번만에 홀인 , Par5 -> 7번만에 홀인(+2)
	//igmTripleBogey : Par4 -> 7번만에 홀인 , Par5 -> 8번만에 홀인(+3)
	//igmQaudrupleBogey : Par5 -> 9번만에 홀인(+4)
	//igmDoublePar : Par3 -> 6번이 되었을때 , Par4 -> 8번이 되었을때 , Par5 -> 10번이되었을때 (x2)
	//igmDoublePar = Toolkit.getDefaultToolkit().getImage("src/images/DoublePar.png");
	         
	Image igmAlbatross, igmHoleInOne, igmEagle, igmBirdie, igmPar, igmOB;
	Image igmBogey, igmDoubleBogey, igmTripleBogey, igmQaudrupleBogey, igmDoublePar;
//      
//	         // Par3
//	         if(cnt == 1) {
//	            g.drawImage(igmHoleInOne, getWidth()/2-380, getHeight()/2-41, 760, 82, this);
//	         } else if(cnt == 2) {
//	            g.drawImage(igmBirdie, getWidth()/2-195, getHeight()/2-41, 390, 82, this);
//	         } else if (cnt == 3) {
//	            g.drawImage(igmPar, getWidth()/2-120, getHeight()/2-46, 240, 92, this);
//	         }else if (cnt == 4) {
//	            g.drawImage(igmBogey, getWidth()/2-185, getHeight()/2-53, 370, 106, this);
//	         }else if (cnt == 5) {
//	            g.drawImage(igmDoubleBogey, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }else if (cnt == 6) {
//	            g.drawImage(igmDoublePar, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }
//	         
//	         // Par4
//	         if(cnt == 1) {
//	            g.drawImage(igmAlbatross,  getWidth()/2-320, getHeight()/2-41, 640, 82, this);
//	         } else if(cnt == 2) {
//	            g.drawImage(igmEagle, getWidth()/2-170, getHeight()/2-41, 340, 82, this);
//	         }else if(cnt == 3) {
//	            g.drawImage(igmBirdie, getWidth()/2-195, getHeight()/2-41, 390, 82, this);
//	         } else if (cnt == 4) {
//	            g.drawImage(igmPar, getWidth()/2-120, getHeight()/2-46, 240, 92, this);
//	         }else if (cnt == 5) {
//	            g.drawImage(igmBogey, getWidth()/2-185, getHeight()/2-53, 370, 106, this);
//	         }else if (cnt == 6) {
//	            g.drawImage(igmDoubleBogey, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }else if (cnt == 7) {
//	            g.drawImage(igmTripleBogey, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }else if (cnt == 8) {
//	            g.drawImage(igmDoublePar, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }
//	         
//	         // Par5
//	         if(cnt == 2) {
//	            g.drawImage(igmAlbatross,  getWidth()/2-320, getHeight()/2-41, 640, 82, this);
//	         } else if(cnt == 3) {
//	            g.drawImage(igmEagle, getWidth()/2-170, getHeight()/2-41, 340, 82, this);
//	         }else if(cnt == 4) {
//	            g.drawImage(igmBirdie, getWidth()/2-195, getHeight()/2-41, 390, 82, this);
//	         } else if (cnt == 5) {
//	            g.drawImage(igmPar, getWidth()/2-120, getHeight()/2-46, 240, 92, this);
//	         }else if (cnt == 6) {
//	            g.drawImage(igmBogey, getWidth()/2-185, getHeight()/2-53, 370, 106, this);
//	         }else if (cnt == 7) {
//	            g.drawImage(igmDoubleBogey, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }else if (cnt == 8) {
//	            g.drawImage(igmTripleBogey, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }else if (cnt == 9) {
//	            g.drawImage(igmQaudrupleBogey, getWidth()/2-320, getHeight()/2-110, 640, 220, this);
//	         }else if (cnt == 10) {
//	            g.drawImage(igmDoublePar, getWidth()/2-210, getHeight()/2-110, 420, 220, this);
//	         }
}
