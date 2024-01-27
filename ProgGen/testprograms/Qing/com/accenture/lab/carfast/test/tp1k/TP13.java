package com.accenture.lab.carfast.test.tp1k;


public class TP13 extends TP11 {


public int TP1method0(int var0, int var1, int var2, int var3, int var4){
 if((((var3*var4)<=(var3-var4))&&((var4-var1)==(var3/(int)(41))))){
System.out.println("TP13 - TP1method0- LineInMethod: 4");
}
else{
 System.out.println("TP13 - TP1method0- LineInMethod: 9");
}
return (int)var3;

}

public int TP13method1(int var0, int var1, int var2, int var3, int var4){
 switch((var4+(int)(57))){
case 0:
System.out.println("TP13 - TP13method1- LineInMethod: 2");
 break;
case 1:
TP1method2(var2,var3,var2,var1,var3,var1,var0,var0); break;
default :
System.out.println("TP13 - TP13method1- LineInMethod: 8");
}
return (int)var1;

}

public int TP1method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 if( (((var2+var7)-(var7%(int)(65)))>((var0*var6)*((var3-var1)*(var1+var5))))){
if( (((var6-var3)%(int)(16))>(var3-var5))){
var6 = (int)((var1+var4)/(int)(29));
}
}
for(int i = 0; i < 2; i++){
 if( ((var1*var3)==(((var4+var7)/(int)(58))-(((var3-var6)+(var1+var0))*(var2-var5))))){
if( ((var3-var5)>(var2%(int)(67)))){
System.out.println("TP13 - TP1method2- LineInMethod: 11");
}
}
}
return (int)var5;

}


public static void main(String args[]){
TP13 obj = new TP13();
obj.TP1method0((int)(37),(int)(43),(int)(12),(int)(6),(int)(3));
obj.TP13method1((int)(56),(int)(66),(int)(46),(int)(42),(int)(18));
obj.TP1method2((int)(22),(int)(43),(int)(54),(int)(43),(int)(72),(int)(76),(int)(3),(int)(28));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP13 obj = new TP13();
obj.TP1method0(i0,i1,i11,i3,i10);
obj.TP13method1(i5,i7,i6,i14,i0);
obj.TP1method2(i5,i6,i4,i12,i3,i13,i2,i7);
}

}