String b = "bottles";
for(int i=99;i>-1;i--){
  String x = Integer.toString(i);
  String y = Integer.toString(i-1);
  if(i==1){
    b = "bottle";
    y = "no more";
  }
  else if(i==0){
    print("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");
    exit();
  }
  print(x + " "+b +" of beer on the wall, "+ x+" "+b+" of beer. Take one down and pass it around, "+y +" "+b+" of beer on the wall. ");
}
