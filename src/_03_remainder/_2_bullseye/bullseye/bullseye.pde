
void setup() {
 
  // set the size of your sketch
  size(400,400);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int x = 350;
  for(int i = 8; i>0; i--){
    if(i%2==0){
      fill(200,200,200);
    }
    else{
      fill(100,100,100);
    }
    ellipse(200,200,x,x);
    x= x-50;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
