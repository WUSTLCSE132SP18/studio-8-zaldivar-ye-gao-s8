#include <SparkFun_MMA8452Q.h> // Includes the SFE_MMA8452Q library

MMA8452Q accel;

void setup() {
  Serial.begin(9600);
  accel.init();
}



void loop() {
  if (accel.available()) {
    accel.read();
    printCalculatedAccels();
  }
  
}

void printCalculatedAccels()
{ 
  Serial.print(accel.cx, 3);
  Serial.print(",");
  Serial.print(accel.cy, 3);
  Serial.print(",");
  Serial.print(accel.cz, 3);
  Serial.println();
}
//
//void printOrientation() {
//  byte pl = accel.readPL();
//  switch (pl)
//  {
//  case PORTRAIT_U:
//    Serial.print("Portrait Up");
//    break;
//  case PORTRAIT_D:
//    Serial.print("Portrait Down");
//    break;
//  case LANDSCAPE_R:
//    Serial.print("Landscape Right");
//    break;
//  case LANDSCAPE_L:
//    Serial.print("Landscape Left");
//    break;
//  case LOCKOUT:
//    Serial.print("Flat");
//    break;
//  }
//}

