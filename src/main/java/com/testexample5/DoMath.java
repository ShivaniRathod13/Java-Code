package com.testexample5;

interface DoMath
{
    double getArea(int rad);
}
interface MathPlus
{
    double getVol(int b, int h);
}
/* Missing Statements ? */

interface AllMaths extends DoMath { float getAvg(int h, int l); }

abstract class AllMath implements DoMath, MathPlus { public double getArea(int rad) { return rad * rad * 3.14; } }
