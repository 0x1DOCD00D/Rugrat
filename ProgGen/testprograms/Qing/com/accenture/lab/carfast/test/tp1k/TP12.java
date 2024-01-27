package com.accenture.lab.carfast.test.tp1k;


public class TP12 extends TP7 {


public int TPInterface0Method3(int var0, int var1, int var2, int var3, int var4){
 switch((var0*(int)(3))){
case 0:
System.out.println("TP12 - TPInterface0Method3- LineInMethod: 2");
 break;
case 1:
var1 = (int)((var1%(int)(22))/(int)(14));
 break;
case 2:
var4 = (int)(((var1-(int)(8))-(var1-var4))%(int)(52));
 break;
default :
var2 = (int)((var0*var1)/(int)(16));
}
return (int)var2;

}

public static int TP12method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8){
 for(int i = 0; i < 0; i++){
 if( ((((var0-var5)*(var8+var1))+(var2%(int)(14)))!=(var3/(int)(64)))){
if( (((var8+var2)/(int)(3))==(var1/(int)(17)))){
var0 = (int)(var1*var3);
}
}
}
switch((var7+(int)(7))){
case 0:
System.out.println("TP12 - TP12method1- LineInMethod: 9");
 break;
case 1:
System.out.println("TP12 - TP12method1- LineInMethod: 14");
 break;
case 2:
System.out.println("TP12 - TP12method1- LineInMethod: 21");
 break;
case 3:
var3 = (int)((var2-var8)+(var4*var7));
 break;
case 4:
var2 = (int)((var4+var5)%(int)(15));
 break;
case 5:
System.out.println("TP12 - TP12method1- LineInMethod: 32");
 break;
case 6:
var6 = (int)((var0-var5)+(var1-var4));
 break;
case 7:
System.out.println("TP12 - TP12method1- LineInMethod: 42");
 break;
case 8:
var7 = (int)(var6-var1);
 break;
default :
System.out.println("TP12 - TP12method1- LineInMethod: 51");
}
return (int)var4;

}

public int TPInterface0Method4(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 for(int i = 0; i < 4; i++){
 if( ((var0-var10)==(var11+var8))){
if( ((var5%(int)(73))<(var3-var5))){
var6 = (int)(((var5/(int)(29))*(var5*var3))+(var1/(int)(18)));
}
}
}
for(int i = 0; i < 4; i++){
 if( ((var4/(int)(30))!=(var2*var3))){
var2 = (int)((var5+var1)-(var11+var7));
}
}
return (int)var4;

}


public static void main(String args[]){
TP12 obj = new TP12();
obj.TPInterface0Method3((int)(48),(int)(24),(int)(6),(int)(66),(int)(14));
TP12method1((int)(23),(int)(10),(int)(13),(int)(31),(int)(30),(int)(59),(int)(49),(int)(12),(int)(28));
obj.TPInterface0Method4((int)(2),(int)(65),(int)(69),(int)(51),(int)(13),(int)(20),(int)(24),(int)(61),(int)(14),(int)(69),(int)(67),(int)(55));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP12 obj = new TP12();
obj.TPInterface0Method3(i11,i14,i5,i4,i12);
TP12method1(i1,i8,i7,i3,i10,i14,i9,i11,i4);
obj.TPInterface0Method4(i2,i10,i0,i5,i3,i12,i4,i6,i1,i8,i7,i11);
}

}