package com.accenture.lab.carfast.test.tp1k;


public class TP4 {


public int TP4method0(int var0, int var1, int var2, int var3, int var4){
 if(((var1+var3)<=(var4-var1))){
System.out.println("TP4 - TP4method0- LineInMethod: 4");
}
else{
 var3 = (int)(var0*var1);
}
for(int i = 0; i < 1; i++){
 if( ((((var4-var0)-(var4*var0))>=(var0-(int)(50)))||(((var2*(int)(64))*(var0+var3))<(var0+(int)(18))))){
var0 = TP4method1(var4,var3,var1,var4,var4);
}
}
return (int)var4;

}

public int TP4method1(int var0, int var1, int var2, int var3, int var4){
 if( ((var4%(int)(59))==(var4*var1))){
if( ((var2-var4)<(var0*var2))){
if( ((var1%(int)(43))==((var4+var2)%(int)(3)))){
if( ((var2*(int)(51))<((var4-var1)%(int)(66)))){
if( ((((var1%(int)(72))*(var1-(int)(7)))<(var1/(int)(40)))||(((var3-var4)%(int)(49))==(var1+var0)))){
if( ((var3*var2)<(var3-var1))){
if( ((var4%(int)(72))>(var1-(int)(58)))){
var0 = (int)(35);
}
}
}
}
}
}
}
return (int)var1;

}

public static int TP4method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10){
 if( (((var9-var7)-(var6+var7))<(var3*var6))){
if( ((var2%(int)(26))==(var2*var6))){
var0 = (int)((var1/(int)(48))%(int)(17));
}
}
if((((((var6*(int)(56))!=(var6+var5))&&((var9/(int)(61))>((var7*var3)+((var4*var7)+(var7-var8)))))&&((((var8-var10)+(var1+var0))-(((var9%(int)(56))*((var1/(int)(25))-(var2*var1)))%(int)(74)))<=(var8*var2)))&&((var2-var7)==(var7*var9)))){
System.out.println("TP4 - TP4method2- LineInMethod: 9");
}
else{
 var6 = (int)(var9-var4);
}
return (int)var0;

}


public static void main(String args[]){
TP4 obj = new TP4();
obj.TP4method0((int)(60),(int)(67),(int)(49),(int)(70),(int)(47));
obj.TP4method1((int)(21),(int)(10),(int)(0),(int)(56),(int)(40));
TP4method2((int)(17),(int)(10),(int)(20),(int)(38),(int)(22),(int)(18),(int)(13),(int)(9),(int)(32),(int)(29),(int)(11));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP4 obj = new TP4();
obj.TP4method0(i1,i12,i0,i10,i2);
obj.TP4method1(i4,i7,i10,i3,i13);
TP4method2(i14,i5,i7,i6,i12,i1,i8,i11,i13,i3,i0);
}

}