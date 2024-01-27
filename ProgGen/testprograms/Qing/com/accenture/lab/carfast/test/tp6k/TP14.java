package com.accenture.lab.carfast.test.tp6k;


public class TP14 {


public int TP14method0(int var0, int var1, int var2, int var3, int var4){
 switch(((var4-var1)-(var2%(int)(16)))){
case 0:
System.out.println("TP14 - TP14method0- LineInMethod: 2");
 break;
case 1:
var1 = (int)(((var1*var4)+(var0-var3))/(int)(14));
 break;
case 2:
TP14method4(var1,var4,var0,var4,var3,var1); break;
case 3:
var1 = (int)((var2*var4)*(var4%(int)(15)));
 break;
default :
System.out.println("TP14 - TP14method0- LineInMethod: 18");
}
return (int)var4;

}

public int TP14method1(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 6; i++){
 var4 = (int)((var0+var1)-((var1/(int)(41))*(var2%(int)(40))));
}
switch((var0*(int)(37))){
case 0:
var3 = (int)((var1%(int)(26))-(var3+var4));
 break;
case 1:
var4 = TP14method4(var4,var1,var3,var2,var2,var3);
 break;
case 2:
var2 = (int)((var3+var0)+((var4/(int)(2))*(var1/(int)(34))));
 break;
default :
System.out.println("TP14 - TP14method1- LineInMethod: 15");
}
return (int)var4;

}

public static int TP14method2(int var0, int var1, int var2, int var3, int var4){
 for(int i = 0; i < 2; i++){
 var2 = (int)(((var1-var2)-((var2+var0)*((var3/(int)(46))*(var3+var0))))-(var3+var1));
}
if(((var3+var0)>=(((var0*var4)-(var3-(int)(39)))-(var3-(int)(9))))){
System.out.println("TP14 - TP14method2- LineInMethod: 7");
}
else{
 var3 = TP14method4(var1,var3,var0,var3,var2,var0);
}
for(int i = 0; i < 2; i++){
 System.out.println("TP14 - TP14method2- LineInMethod: 15");
}
return (int)var1;

}

public static int TP14method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11){
 switch((var2/(int)(30))){
case 0:
System.out.println("TP14 - TP14method3- LineInMethod: 2");
 break;
case 1:
var1 = (int)(var7*var9);
 break;
default :
var6 = (int)((var11*var10)+(var1+var2));
}
if(((var11-var6)==(((var10-var1)%(int)(30))-(var4/(int)(39))))){
System.out.println("TP14 - TP14method3- LineInMethod: 15");
}
else{
 var5 = (int)((var2-var4)-(var1-var4));
}
if(((var10+var1)>(var9/(int)(27)))){
var8 = (int)(0);
}
else{
 var4 = (int)(var1*var4);
}
return (int)var4;

}

public static int TP14method4(int var0, int var1, int var2, int var3, int var4, int var5){
 switch((var1+var5)){
case 0:
System.out.println("TP14 - TP14method4- LineInMethod: 2");
 break;
case 1:
System.out.println("TP14 - TP14method4- LineInMethod: 9");
 break;
case 2:
System.out.println("TP14 - TP14method4- LineInMethod: 15");
 break;
default :
System.out.println("TP14 - TP14method4- LineInMethod: 18");
}
return (int)var4;

}


public static void main(String args[]){
TP14 obj = new TP14();
obj.TP14method0((int)(27),(int)(1),(int)(20),(int)(15),(int)(6));
obj.TP14method1((int)(20),(int)(30),(int)(0),(int)(23),(int)(9));
TP14method2((int)(0),(int)(18),(int)(44),(int)(3),(int)(24));
TP14method3((int)(25),(int)(48),(int)(24),(int)(2),(int)(29),(int)(27),(int)(23),(int)(31),(int)(48),(int)(30),(int)(30),(int)(34));
TP14method4((int)(34),(int)(44),(int)(13),(int)(6),(int)(31),(int)(49));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP14 obj = new TP14();
obj.TP14method0(i14,i3,i11,i2,i9);
obj.TP14method1(i6,i14,i5,i8,i11);
TP14method2(i3,i13,i9,i10,i5);
TP14method3(i7,i5,i12,i14,i10,i13,i1,i2,i4,i0,i6,i8);
TP14method4(i3,i11,i13,i6,i4,i12);
}

}