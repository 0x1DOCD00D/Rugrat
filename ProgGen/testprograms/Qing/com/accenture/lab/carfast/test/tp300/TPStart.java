package com.accenture.lab.carfast.test.tp300;


public class TPStart {
private static int f0;
private static int f1;
private static int f2;
private static int f3;
private static int f4;
private static int f5;
private static int f6;
private static int f7;
private static int f8;
private static int f9;
private static int f10;
private static int f11;
private static int f12;
private static int f13;
private static int f14;


private static void subEntryMethod0(){
TP0.singleEntry(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14);
TP1.singleEntry(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14);
TP2.singleEntry(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14);
}



public static void entryMethod(int i0,int i1,int i2,int i3,int i4,int i5,int i6,int i7,int i8,int i9,int i10,int i11,int i12,int i13,int i14){
f0 = i0;
f1 = i1;
f2 = i2;
f3 = i3;
f4 = i4;
f5 = i5;
f6 = i6;
f7 = i7;
f8 = i8;
f9 = i9;
f10 = i10;
f11 = i11;
f12 = i12;
f13 = i13;
f14 = i14;


subEntryMethod0();

}
public static void main(String[] args){
 entryMethod(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5]),Integer.parseInt(args[6]),Integer.parseInt(args[7]),Integer.parseInt(args[8]),Integer.parseInt(args[9]),Integer.parseInt(args[10]),Integer.parseInt(args[11]),Integer.parseInt(args[12]),Integer.parseInt(args[13]),Integer.parseInt(args[14]));
}}