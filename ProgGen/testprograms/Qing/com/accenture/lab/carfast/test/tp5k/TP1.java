package com.accenture.lab.carfast.test.tp5k;


public class TP1 {


public int TP1method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 switch((var2-(int)(16))){
case 0:
System.out.println("TP1 - TP1method0- LineInMethod: 2");
 break;
case 1:
var5 = (int)((var1+var3)*((var6+var3)-(var0%(int)(22))));
 break;
case 2:
System.out.println("TP1 - TP1method0- LineInMethod: 12");
 break;
default :
var0 = TP1method2(var1,var5,var1,var4,var5);
}
for(int i = 0; i < 4; i++){
 var2 = (int)((var5*var3)+(var0%(int)(45)));
}
if(((var4+var5)<(var2+var6))){
System.out.println("TP1 - TP1method0- LineInMethod: 27");
}
else{
 var6 = (int)(((var1-var2)*(var4+var6))+(var4*var2));
}
return (int)var5;

}

public int TP1method1(int var0, int var1, int var2, int var3, int var4){
 switch((var0*(int)(52))){
case 0:
var1 = (int)((var4/(int)(14))+(var0+var3));
 break;
case 1:
var0 = TP1method2(var1,var0,var4,var3,var3);
 break;
case 2:
System.out.println("TP1 - TP1method1- LineInMethod: 8");
 break;
case 3:
var0 = (int)(70);
 break;
case 4:
var4 = TP1method3(var4,var2,var4,var4,var4,var0,var4,var2,var3,var0,var1,var0);
 break;
case 5:
var3 = (int)(var4%(int)(5));
 break;
case 6:
var4 = (int)((var1*(int)(12))+(var4%(int)(38)));
 break;
case 7:
System.out.println("TP1 - TP1method1- LineInMethod: 26");
 break;
default :
System.out.println("TP1 - TP1method1- LineInMethod: 33");
}
return (int)var1;

}

public static int TP1method2(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 0; i++){
 if( ((var0+(int)(1))!=(var1+var2))){
System.out.println("TP1 - TP1method2- LineInMethod: 4");
}
}
for(int i = 0; i < 1; i++){
 if( ((var2-var4)>=(var1*var3))){
if( ((var1%(int)(71))!=(var2+var3))){
if( (((var0%(int)(61))<=(var3/(int)(69)))&&((var3-(int)(41))==(var0*var1)))){
TP1method3(var3,var4,var3,var1,var4,var1,var1,var1,var1,var3,var1,var0);}
}
}
}
for(int i = 0; i < 2; i++){
 if( ((var3+var0)>=(var1*var4))){
if( ((var0-var1)>=(var1+var0))){
if( (((var0+(int)(0))<=(var0-var4))&&((var1-(int)(41))==(var3*var2)))){
System.out.println("TP1 - TP1method2- LineInMethod: 24");
}
}
}
}
return (int)var2;

}

public static int TP1method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 if( ((((var4*var8)*((var2%(int)(58))-((var10*(int)(33))/(int)(21))))*(var2-(int)(12)))>=(var3+var9))){
if( (((var11-var0)<=((var5+var4)%(int)(23)))&&((var8%(int)(59))<(var5%(int)(66))))){
if( ((var1*var10)>(var0*var7))){
var2 = (int)((var2*var9)*(var10+var3));
}
}
}
switch((var9%(int)(16))){
case 0:
var9 = (int)(var5/(int)(67));
 break;
case 1:
System.out.println("TP1 - TP1method3- LineInMethod: 12");
 break;
case 2:
System.out.println("TP1 - TP1method3- LineInMethod: 19");
 break;
default :
var5 = (int)(33);
}
return (int)var7;

}


public static void main(String args[]){
TP1 obj = new TP1();
obj.TP1method0((int)(61),(int)(38),(int)(37),(int)(47),(int)(67),(int)(63),(int)(5));
obj.TP1method1((int)(75),(int)(12),(int)(45),(int)(37),(int)(60));
TP1method2((int)(28),(int)(0),(int)(9),(int)(38),(int)(41));
TP1method3((int)(24),(int)(13),(int)(45),(int)(14),(int)(5),(int)(61),(int)(44),(int)(27),(int)(66),(int)(13),(int)(45),(int)(67));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP1 obj = new TP1();
obj.TP1method0(i9,i2,i4,i6,i8,i3,i7);
obj.TP1method1(i14,i12,i1,i4,i3);
TP1method2(i2,i12,i0,i1,i8);
TP1method3(i4,i11,i7,i8,i5,i2,i1,i9,i14,i6,i10,i3);
}

}