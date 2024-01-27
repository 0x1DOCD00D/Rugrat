package com.accenture.lab.carfast.test.tp2k;


public class TP3 extends TP12 {


public int TP3method0(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12){
 switch((var8-var4)){
case 0:
var4 = (int)((var0*var7)+(var11%(int)(21)));
 break;
case 1:
var6 = TP12method1(var5,var11,var11,var0,var8,var0);
 break;
case 2:
TP3method2(var4,var2,var0,var12,var11,var11,var3,var0); break;
case 3:
var12 = (int)(var3+var9);
 break;
case 4:
var2 = (int)(((var4*var6)%(int)(49))*((var10/(int)(18))*(var6+var4)));
 break;
default :
System.out.println("TP3 - TP3method0- LineInMethod: 17");
}
return (int)var9;

}

public int TP12method1(int var0, int var1, int var2, int var3, int var4, int var5){
 if( ((var0/(int)(30))==(var1-var2))){
if( (((var1+(int)(22))+(((var5/(int)(39))+(var3*var4))-(var5-var4)))<=(var1*var0))){
var2 = TP3method2(var4,var3,var0,var4,var1,var5,var0,var2);
}
}
switch(((var0*(int)(49))%(int)(6))){
case 0:
System.out.println("TP3 - TP12method1- LineInMethod: 7");
 break;
case 1:
var2 = (int)(4);
 break;
case 2:
var3 = (int)(var1+var2);
 break;
case 3:
System.out.println("TP3 - TP12method1- LineInMethod: 15");
 break;
default :
var0 = (int)(((var2%(int)(15))+(var4+var2))-(var0%(int)(43)));
}
return (int)var0;

}

public static int TP3method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 for(int i = 0; i < 2; i++){
 System.out.println("TP3 - TP3method2- LineInMethod: 2");
}
for(int i = 0; i < 0; i++){
 var7 = (int)(41);
}
if(((var0%(int)(33))==(var0+(int)(45)))){
System.out.println("TP3 - TP3method2- LineInMethod: 12");
}
else{
 var6 = (int)(var7%(int)(16));
}
return (int)var3;

}

public int TP12method2(int var0, int var1, int var2, int var3){
 for(int i = 0; i < 1; i++){
 System.out.println("TP3 - TP12method2- LineInMethod: 2");
}
for(int i = 0; i < 1; i++){
 if( ((((var1+var2)+(var0+var3))%(int)(21))==(var1+var2))){
var3 = (int)((var1*(int)(27))%(int)(9));
}
}
for(int i = 0; i < 4; i++){
 System.out.println("TP3 - TP12method2- LineInMethod: 13");
}
return (int)var3;

}


public static void main(String args[]){
TP3 obj = new TP3();
obj.TP3method0((int)(44),(int)(24),(int)(16),(int)(49),(int)(17),(int)(22),(int)(16),(int)(13),(int)(43),(int)(26),(int)(23),(int)(44),(int)(24));
obj.TP12method1((int)(10),(int)(34),(int)(6),(int)(41),(int)(1),(int)(7));
TP3method2((int)(11),(int)(0),(int)(11),(int)(10),(int)(41),(int)(28),(int)(27),(int)(4));
obj.TP12method2((int)(15),(int)(11),(int)(37),(int)(1));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP3 obj = new TP3();
obj.TP3method0(i7,i4,i1,i0,i5,i2,i6,i9,i3,i10,i8,i13,i14);
obj.TP12method1(i8,i14,i12,i0,i4,i9);
TP3method2(i11,i2,i8,i0,i6,i12,i5,i14);
obj.TP12method2(i4,i9,i6,i0);
}

}