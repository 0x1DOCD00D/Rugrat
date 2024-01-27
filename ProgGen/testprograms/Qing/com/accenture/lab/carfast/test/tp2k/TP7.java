package com.accenture.lab.carfast.test.tp2k;


public class TP7 extends TP3 {


public int TP7method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 4; i++){
 if( ((var0*var3)>=(var4*var2))){
if( ((var4-var0)<=(var0*(int)(4)))){
TP7method2(var4,var4,var2,var4,var3,var3,var1);}
}
}
switch((var4%(int)(1))){
case 0:
var0 = (int)((var0+var1)-(var2%(int)(21)));
 break;
case 1:
var0 = (int)(var3*var4);
 break;
case 2:
var0 = TP3method2(var0,var2,var3,var0,var4,var4,var0,var0);
 break;
default :
System.out.println("TP7 - TP7method0- LineInMethod: 18");
}
return (int)var3;

}

public int TP3method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 if( ((var8*var11)<=(var4+var7))){
if( (((((var8*var11)*(var5%(int)(26)))*(((var11-var0)/(int)(16))/(int)(19)))+(var0%(int)(7)))>=(var10-var0))){
if( ((var2-var10)<(var7*var3))){
var8 = TP3method2(var2,var9,var12,var5,var6,var3,var0,var5);
}
}
}
if( ((var10+var2)>=(var4/(int)(25)))){
System.out.println("TP7 - TP3method0- LineInMethod: 9");
}
if( ((var2-(int)(41))>=(var11-var5))){
System.out.println("TP7 - TP3method0- LineInMethod: 13");
}
return (int)var10;

}

public int TP7method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if(((((var4*var6)<(var1%(int)(24)))||(((var2-var0)!=(var0*var6))&&(((var1+var4)*(var2*var1))!=(var2+var5))))&&((((var1-var4)-(var0-var3))*(var6+var5))>(var1+var5)))){
System.out.println("TP7 - TP7method2- LineInMethod: 4");
}
else{
 System.out.println("TP7 - TP7method2- LineInMethod: 5");
}
switch(((var6-var5)*(var0*var4))){
case 0:
var5 = (int)((var1*var2)%(int)(25));
 break;
case 1:
System.out.println("TP7 - TP7method2- LineInMethod: 14");
 break;
case 2:
var3 = (int)(((var5-var3)*(var5*var0))+((var0*(int)(11))*(var6%(int)(22))));
 break;
case 3:
System.out.println("TP7 - TP7method2- LineInMethod: 20");
 break;
case 4:
System.out.println("TP7 - TP7method2- LineInMethod: 23");
 break;
case 5:
var0 = (int)((var0+var5)/(int)(12));
 break;
case 6:
var3 = (int)((var0%(int)(2))-(var4+(int)(47)));
 break;
default :
System.out.println("TP7 - TP7method2- LineInMethod: 32");
}
return (int)var6;

}

public static int TP3method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch(((var2+(int)(43))/(int)(37))){
case 0:
var4 = (int)((var6/(int)(49))+(var4*var2));
 break;
case 1:
System.out.println("TP7 - TP3method2- LineInMethod: 5");
 break;
case 2:
var0 = (int)(8);
 break;
default :
System.out.println("TP7 - TP3method2- LineInMethod: 13");
}
return (int)var2;

}


public static void main(String args[]){
TP7 obj = new TP7();
obj.TP7method0((int)(37),(int)(38),(int)(14),(int)(39),(int)(14));
obj.TP3method0((int)(44),(int)(36),(int)(30),(int)(3),(int)(21),(int)(43),(int)(38),(int)(22),(int)(4),(int)(34),(int)(13),(int)(48),(int)(36));
obj.TP7method2((int)(33),(int)(1),(int)(33),(int)(12),(int)(31),(int)(3),(int)(39));
TP3method2((int)(36),(int)(22),(int)(2),(int)(48),(int)(16),(int)(41),(int)(48),(int)(2));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP7 obj = new TP7();
obj.TP7method0(i8,i14,i2,i1,i7);
obj.TP3method0(i3,i2,i5,i1,i11,i8,i13,i0,i7,i14,i9,i4,i10);
obj.TP7method2(i0,i4,i7,i14,i3,i10,i1);
TP3method2(i1,i14,i10,i0,i6,i11,i2,i13);
}

}