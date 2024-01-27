package com.accenture.lab.carfast.test.tp2k;


public class TP12 implements TPInterface1 {


public int TPInterface1Method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9){
 if(((var7/(int)(9))==(var2-var4))){
var1 = TP12method1(var5,var8,var8,var2,var9,var5);
}
else{
 var8 = TP12method1(var1,var8,var9,var1,var9,var1);
}
if( ((var3*var8)<=(var3*var1))){
System.out.println("TP12 - TPInterface1Method0- LineInMethod: 8");
}
return (int)var2;

}

public static int TP12method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 for(int i = 0; i < 2; i++){
 System.out.println("TP12 - TP12method0- LineInMethod: 2");
}
if( ((var0+var3)<=(var0+var5))){
if( (((var1-var2)-(var5%(int)(35)))==((var3+var7)%(int)(29)))){
if( ((var1/(int)(35))<=(var4*var7))){
System.out.println("TP12 - TP12method0- LineInMethod: 13");
}
}
}
return (int)var5;

}

public int TP12method1(int var0, int var1, int var2, int var3, int var4, int var5){
 switch((var5*var4)){
case 0:
var2 = (int)(var1-var4);
 break;
case 1:
System.out.println("TP12 - TP12method1- LineInMethod: 5");
 break;
case 2:
System.out.println("TP12 - TP12method1- LineInMethod: 12");
 break;
default :
System.out.println("TP12 - TP12method1- LineInMethod: 18");
}
return (int)var5;

}

public int TP12method2(int var0, int var1, int var2, int var3){
 if( ((var2*var3)!=(var2+(int)(1)))){
if( ((var1*var3)==(var1-var0))){
System.out.println("TP12 - TP12method2- LineInMethod: 4");
}
}
if(((var3*var0)<(var0/(int)(46)))){
var0 = (int)(31);
}
else{
 System.out.println("TP12 - TP12method2- LineInMethod: 12");
}
return (int)var0;

}

public static int TP12method3(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch(((var3*(int)(33))*(var8/(int)(23)))){
case 0:
var1 = (int)(30);
 break;
case 1:
var3 = (int)(((var3*var5)*((var11-var4)*(var8+var1)))*(var6*var8));
 break;
case 2:
System.out.println("TP12 - TP12method3- LineInMethod: 7");
 break;
case 3:
var12 = (int)(14);
 break;
case 4:
var7 = (int)((var7*var4)*(var12*var5));
 break;
default :
System.out.println("TP12 - TP12method3- LineInMethod: 16");
}
return (int)var9;

}


public static void main(String args[]){
TP12 obj = new TP12();
obj.TPInterface1Method0((int)(25),(int)(15),(int)(33),(int)(26),(int)(16),(int)(36),(int)(49),(int)(1),(int)(6),(int)(26));
TP12method0((int)(3),(int)(36),(int)(7),(int)(45),(int)(47),(int)(27),(int)(27),(int)(43),(int)(26),(int)(8),(int)(9));
obj.TP12method1((int)(37),(int)(19),(int)(6),(int)(11),(int)(26),(int)(13));
obj.TP12method2((int)(20),(int)(29),(int)(6),(int)(47));
TP12method3((int)(18),(int)(3),(int)(13),(int)(28),(int)(5),(int)(4),(int)(35),(int)(29),(int)(35),(int)(36),(int)(5),(int)(36),(int)(26));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP12 obj = new TP12();
obj.TPInterface1Method0(i10,i8,i11,i5,i4,i13,i12,i7,i3,i6);
TP12method0(i9,i7,i5,i0,i2,i14,i11,i4,i1,i10,i3);
obj.TP12method1(i7,i4,i2,i9,i5,i13);
obj.TP12method2(i7,i5,i4,i13);
TP12method3(i1,i3,i0,i6,i11,i12,i14,i9,i10,i8,i13,i2,i7);
}

}