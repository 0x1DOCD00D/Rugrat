package com.accenture.lab.carfast.test.tp1k;


public class TP11 extends TP1 {


public int TP1method2(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7){
 switch((var0+(int)(50))){
case 0:
var0 = (int)(var6+var7);
 break;
case 1:
System.out.println("TP11 - TP1method2- LineInMethod: 5");
 break;
case 2:
var5 = (int)((var7/(int)(63))/(int)(21));
 break;
case 3:
System.out.println("TP11 - TP1method2- LineInMethod: 14");
 break;
case 4:
var4 = (int)((var6-var5)*(var0-var2));
 break;
case 5:
System.out.println("TP11 - TP1method2- LineInMethod: 21");
 break;
case 6:
System.out.println("TP11 - TP1method2- LineInMethod: 24");
 break;
case 7:
var0 = (int)(((var4+var3)/(int)(20))*(var6%(int)(41)));
 break;
case 8:
System.out.println("TP11 - TP1method2- LineInMethod: 34");
 break;
default :
System.out.println("TP11 - TP1method2- LineInMethod: 38");
}
return (int)var6;

}

public int TP11method1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13){
 if( ((var7%(int)(66))>=(var7+var3))){
if( (((var8-var0)-(((var11-var5)*(var0-var3))+(var12%(int)(19))))<(var9*var7))){
var8 = (int)((var1/(int)(36))-(var0*var9));
}
}
if( (((var0+var13)<=(var6/(int)(23)))&&((var8*var10)>=(var12-var3)))){
var13 = (int)(((var4%(int)(68))*(var9*var4))-(var8+var0));
}
return (int)var10;

}

public int TP1method0(int var0, int var1, int var2, int var3, int var4){
 if(((var4*var0)==(var1-var4))){
var1 = (int)((var1+var3)*((var0/(int)(7))*(var0%(int)(23))));
}
else{
 var4 = (int)((var2+(int)(44))-(var0*var4));
}
for(int i = 0; i < 1; i++){
 var0 = (int)(((var2-var3)+(var1+var4))*(var4-(int)(73)));
}
return (int)var1;

}


public static void main(String args[]){
TP11 obj = new TP11();
obj.TP1method2((int)(72),(int)(7),(int)(52),(int)(2),(int)(9),(int)(32),(int)(21),(int)(21));
obj.TP11method1((int)(25),(int)(63),(int)(28),(int)(46),(int)(48),(int)(16),(int)(54),(int)(60),(int)(39),(int)(1),(int)(11),(int)(31),(int)(13),(int)(62));
obj.TP1method0((int)(14),(int)(52),(int)(39),(int)(43),(int)(69));
}

public static void singleEntry(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
TP11 obj = new TP11();
obj.TP1method2(i8,i11,i6,i0,i7,i10,i1,i4);
obj.TP11method1(i8,i3,i4,i5,i12,i13,i6,i14,i10,i7,i9,i0,i11,i2);
obj.TP1method0(i6,i12,i0,i2,i14);
}

}