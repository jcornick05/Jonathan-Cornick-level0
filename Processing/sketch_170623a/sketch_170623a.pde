import ddf.minim.*;
AudioSample sound;

int y=225;
int x=195;

int j=176;
int n=310;

int acceleration=1;

void setup (){
  fill(0,255,253);
  Minim minim = new Minim(this);
  sound = minim.loadSample("mininglaser.wav");
 size(1000,500);
  PImage catPic = loadImage("images.jpg");
  catPic.resize(1000,500);
  background(catPic);
}

void draw (){
  
  noStroke();
  strokeWeight(3);
  
    if(x<0){
    x=195;
    y=225;
    fill(5,20,255);
    acceleration=2;
  }
  if(x<0){
    x=195;
    y=225;
    fill(0,255,18);
    acceleration=3;
  }
  
  ellipse(x,y,20,20);
  ellipse(j,n,20,20);
  
}

void keyPressed () {
  if(acceleration==1){
    sound.trigger();
  }
  x-=2*acceleration;
  y-=2*acceleration;
  
  j-=2*acceleration;
  n-=2*acceleration;
  
  acceleration++;


}



