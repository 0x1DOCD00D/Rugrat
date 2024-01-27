package com.accenture.lab.carfast.test.tp5k;


public class TP10 {


public static int TP10method0(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 3; i++){
 if( ((var0*var2)>=(var4*var2))){
TP10method1(var0,var2,var2,var3,var1,var0,var2,var4);}
}
if(((var1+(int)(26))<((var3/(int)(33))+(var1%(int)(41))))){
TP10method1(var4,var4,var3,var1,var4,var4,var3,var4);}
else{
 TP10method1(var2,var2,var1,var3,var4,var1,var1,var2);}
switch((var3-(int)(0))){
case 0:
System.out.println("TP10 - TP10method0- LineInMethod: 13");
 break;
case 1:
System.out.println("TP10 - TP10method0- LineInMethod: 16");
 break;
case 2:
System.out.println("TP10 - TP10method0- LineInMethod: 20");
 break;
case 3:
var4 = (int)((var2%(int)(55))-(var3-var2));
 break;
case 4:
var0 = (int)((var4+var1)%(int)(42));
 break;
case 5:
var4 = TP10method1(var3,var1,var0,var3,var3,var1,var4,var2);
 break;
case 6:
var2 = TP10method1(var0,var0,var2,var1,var1,var3,var2,var3);
 break;
case 7:
System.out.println("TP10 - TP10method0- LineInMethod: 38");
 break;
default :
System.out.println("TP10 - TP10method0- LineInMethod: 44");
}
return (int)var4;

}

public static int TP10method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var6%(int)(11))){
case 0:
System.out.println("TP10 - TP10method1- LineInMethod: 2");
 break;
case 1:
var4 = (int)((var7/(int)(60))*((var0%(int)(8))/(int)(64)));
 break;
case 2:
var7 = (int)(52);
 break;
case 3:
var0 = (int)((var7+var4)*(var0%(int)(28)));
 break;
default :
System.out.println("TP10 - TP10method1- LineInMethod: 17");
}
if(((var6-var0)>(var3+(int)(7)))){
var5 = (int)((var0%(int)(47))*(var7/(int)(21)));
}
else{
 System.out.println("TP10 - TP10method1- LineInMethod: 23");
}
return (int)var5;

}

public int TP10method2(int var0, int var1, int var2, int var3, int var4, int var5){
 if(((var4+var2)<(var5*var0))){
var1 = (int)((var2*var0)%(int)(63));
}
else{
 var0 = (int)((var0*var2)+(((var0+var5)*((var0*var2)-(var1+var3)))*((var3/(int)(55))%(int)(4))));
}
for(int i = 0; i < 0; i++){
 if( ((var0-var3)==(var3+var4))){
var4 = (int)(var2-var5);
}
}
if( ((var1/(int)(36))!=(var3%(int)(19)))){
var2 = (int)(62);
}
if( (((var3*var1)>=(var1-var2))&&((var0*var2)>=(((var0/(int)(19))/(int)(30))-(var4*var2))))){
var0 = (int)(12);
}
if(((var5+var3)>=((var4*var5)+((var4-(int)(36))%(int)(66))))){
var5 = (int)(((var5-var0)*(var4-var2))+((var0+var2)-(var1+var2)));
}
else{
 System.out.println("TP10 - TP10method2- LineInMethod: 20");
}
return (int)var2;

}

public int TP10method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6){
 if((((var3%(int)(75))!=(var4*var2))&&((var4*var3)>((var4-var0)+(var6+(int)(1)))))){
var3 = (int)(((var2-(int)(13))+(var3%(int)(8)))-(var6%(int)(32)));
}
else{
 var2 = (int)((var2/(int)(39))%(int)(1));
}
for(int i = 0; i < 3; i++){
 var4 = (int)((var4/(int)(29))/(int)(44));
}
for(int i = 0; i < 2; i++){
 System.out.println("TP10 - TP10method3- LineInMethod: 11");
}
switch(((var6%(int)(34))*(var0*(int)(26)))){
case 0:
var0 = (int)(((var1-(int)(66))*(var4*var6))/(int)(24));
 break;
case 1:
var3 = (int)((((var5*(int)(74))+(var3*var2))*(var0+var5))+(var6*var0));
 break;
case 2:
System.out.println("TP10 - TP10method3- LineInMethod: 24");
 break;
case 3:
var5 = (int)(15);
 break;
case 4:
System.out.println("TP10 - TP10method3- LineInMethod: 33");
 break;
default :
var2 = (int)(64);
}
return (int)var4;

}


public static void main(String args[]){
TP10 obj = new TP10();
TP10method0((int)(3),(int)(7),(int)(57),(int)(11),(int)(48));
TP10method1((int)(50),(int)(3),(int)(7),(int)(34),(int)(72),(int)(21),(int)(1),(int)(3));
obj.TP10method2((int)(5),(int)(74),(int)(51),(int)(14),(int)(18),(int)(42));
obj.TP10method3((int)(74),(int)(1),(int)(30),(int)(58),(int)(49),(int)(70),(int)(67));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP10 obj = new TP10();
TP10method0(i13,i3,i1,i8,i6);
TP10method1(i11,i13,i12,i0,i8,i6,i1,i5);
obj.TP10method2(i14,i11,i5,i3,i10,i7);
obj.TP10method3(i1,i6,i9,i4,i7,i12,i10);
}

}