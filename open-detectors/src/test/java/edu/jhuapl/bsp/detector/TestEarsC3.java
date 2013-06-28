/*
 * Copyright (c) 2013 The Johns Hopkins University/Applied Physics Laboratory
 *                             All rights reserved.
 *                      
 * This material may be used, modified, or reproduced by or for the U.S. 
 * Government pursuant to the rights granted under the clauses at             
 * DFARS 252.227-7013/7014 or FAR 52.227-14.
 *                      
 * Licensed under the Apache License, Version 2.0 (the "License");            
 * you may not use this file except in compliance with the License.           
 * You may obtain a copy of the License at                                    
 *                                                                             
 *     http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * NO WARRANTY.   THIS MATERIAL IS PROVIDED "AS IS."  JHU/APL DISCLAIMS ALL
 * WARRANTIES IN THE MATERIAL, WHETHER EXPRESS OR IMPLIED, INCLUDING (BUT NOT
 * LIMITED TO) ANY AND ALL IMPLIED WARRANTIES OF PERFORMANCE,
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NON-INFRINGEMENT OF
 * INTELLECTUAL PROPERTY RIGHTS. ANY USER OF THE MATERIAL ASSUMES THE ENTIRE
 * RISK AND LIABILITY FOR USING THE MATERIAL.  IN NO EVENT SHALL JHU/APL BE
 * LIABLE TO ANY USER OF THE MATERIAL FOR ANY ACTUAL, INDIRECT,     
 * CONSEQUENTIAL, SPECIAL OR OTHER DAMAGES ARISING FROM THE USE OF, OR    
 * INABILITY TO USE, THE MATERIAL, INCLUDING, BUT NOT LIMITED TO, ANY DAMAGES
 * FOR LOST PROFITS.
 */

package edu.jhuapl.bsp.detector;

import junit.framework.TestCase;

public class TestEarsC3 extends TestCase {

    static final double[] vec1 =
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0,
             0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0,
             0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 1, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 2, 4, 4, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 2, 1, 0, 0,
             0, 0, 3, 4, 0, 1, 2, 2, 2, 1, 0, 1, 0, 0, 0, 0, 1, 0, 2, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 3, 2, 2, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0,
             0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 2, 0, 2, 1, 0, 2, 0, 3, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1,
             0, 0, 0, 0, 0, 1, 0, 2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 2, 0, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 2,
             0, 1, 1, 0, 0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 1, 0, 0, 1, 0, 1, 0, 0, 2, 3, 1, 1, 1, 0, 1, 2, 1, 0, 1, 1, 0, 0,
             0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0,
             0, 2, 0, 1, 0, 0, 0, 1, 0, 0, 3, 2, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0,
             1, 0, 1, 0, 1, 5, 0, 5, 1, 4, 4, 5, 5, 3, 4, 7, 1, 2, 1, 3, 5, 2, 1, 1, 2, 0, 0, 1, 1, 2, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 0,
             0, 0, 0, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1,
             0, 0, 2, 0, 1, 2, 0, 1, 0, 0, 0, 3, 1, 0, 2, 2, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 2, 2, 1, 1, 0, 1, 0, 3,
             1, 1, 1, 3, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 2,
             2, 3, 0, 3, 6, 6, 5, 3, 3, 7, 1, 4, 2, 0, 1, 1, 3, 2, 1, 1, 2, 3, 1, 0, 3, 3, 0, 1, 2, 1, 0, 1, 2, 1, 0, 2,
             0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 2, 1, 0, 0, 1, 1, 0, 1, 2, 2, 1, 1, 1, 5, 3, 6, 4, 2, 3, 3, 1, 1, 0, 0,
             0, 0, 0, 0, 0, 2, 0, 4, 1, 1, 0, 1, 0, 0, 1, 2, 3, 0, 2, 1, 2, 3, 2, 1, 2, 2, 0, 1, 2, 0, 0, 1, 2, 2, 6, 3,
             0, 0, 4, 2, 1, 0, 1, 2, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0};

    static final double[] vec2 =
            {0, 2, 8, 5, 3, 4, 5, 1, 2, 2, 1, 2, 0, 4, 2, 3, 1, 0, 5, 3, 1, 0, 1, 2, 1, 1, 1, 0, 2, 1, 2, 5, 2, 1, 4, 0,
             4, 3, 5, 7, 4, 8, 2, 2, 2, 9, 7, 5, 4, 8, 8, 10, 5, 9, 11, 13, 11, 9, 9, 10, 10, 6, 2, 5, 3, 3, 4, 0, 0, 0,
             0, 1, 0, 0, 1, 1, 1, 0, 2, 0, 1, 1, 1, 4, 2, 5, 2, 2, 3, 3, 1, 1, 2, 3, 1, 1, 2, 3, 3, 2, 1, 0, 2, 0, 1, 2,
             2, 1, 4, 2, 0, 4, 1, 2, 2, 1, 2, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 3, 1, 4, 3, 2, 3, 4, 1, 5, 9, 7, 11, 9,
             8, 4, 7, 7, 8, 10, 5, 6, 3, 7, 6, 2, 4, 4, 1, 2, 2, 4, 3, 3, 3, 1, 2, 2, 2, 3, 0, 1, 1, 0, 1, 0, 1, 0, 0,
             1, 0, 0, 2, 0, 1, 0, 0, 1, 3, 3, 5, 2, 3, 4, 2, 0, 4, 3, 6, 2, 7, 1, 5, 2, 4, 4, 6, 8, 1, 6, 9, 14, 10, 3,
             3, 9, 6, 6, 8, 0, 4, 5, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 4, 0, 0, 0, 1, 0, 3, 3, 6, 3, 7, 16, 10, 6, 6,
             6, 14, 6, 8, 7, 0, 0, 2, 13, 15, 13, 13, 8, 5, 3, 4, 4, 5, 2, 4, 2, 1, 4, 0, 6, 5, 2, 2, 2, 1, 2, 2, 0, 0,
             0, 1, 0, 1, 1, 0, 0, 0, 0, 2, 4, 0, 3, 6, 6, 12, 15, 21, 31, 34, 21, 19, 29, 21, 8, 18, 23, 14, 7, 14, 12,
             8, 7, 8, 5, 7, 9, 4, 7, 2, 5, 3, 2, 3, 4, 4, 1, 2, 0, 4, 2, 3, 1, 1, 0, 1, 2, 3, 1, 1, 0, 0, 1, 3, 1, 1, 2,
             2, 0, 0, 2, 0, 3, 1, 0, 1, 3, 1, 3, 2, 0, 1, 0, 1, 0, 0, 0, 0, 2, 0, 2, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0,
             0, 0, 0, 1, 1, 0, 3, 1, 0, 3, 5, 4, 8, 6, 6, 5, 10, 13, 5, 10, 11, 13, 5, 2, 7, 5, 6, 6, 9, 8, 15, 3, 5, 9,
             11, 2, 6, 10, 6, 6, 5, 5, 9, 1, 6, 0, 0, 3, 3, 3, 2, 2, 4, 4, 3, 2, 0, 3, 3, 1, 6, 9, 7, 11, 11, 11, 11,
             12, 11, 11, 9, 7, 6, 8, 7, 5, 3, 3, 9, 5, 0, 2, 2, 2, 0, 2, 0, 2, 4, 1, 2, 0, 1, 1, 3, 3, 2, 0, 1, 0, 0, 0,
             1, 0, 1, 2, 0, 0, 0, 2, 0, 1, 2, 0, 2, 1, 4, 5, 8, 6, 1, 2, 4, 5, 8, 5, 6, 8, 4, 11, 7, 7, 18, 26, 15, 12,
             12, 6, 10, 6, 4, 11, 6, 6, 6, 5, 2, 4, 5, 6, 7, 5, 2, 4, 1, 0, 0, 1, 0, 0, 0, 0, 2, 3, 1, 2, 0, 4, 4, 1, 9,
             7, 6, 11, 7, 9, 14, 18, 11, 12, 20, 15, 14, 23, 19, 21, 18, 11, 12, 2, 10, 4, 2, 6, 3, 3, 2, 1, 4, 4, 0, 2,
             2, 1, 3, 1, 0, 1, 1, 1, 0, 0, 1, 0, 2, 1, 0, 2, 6, 2, 4, 2, 6, 11, 4, 6, 8, 9, 6, 5, 6, 9, 8, 2, 8, 3, 10,
             16, 11, 14, 9, 11, 11, 7, 10, 11, 10, 4, 7, 4, 2, 5, 3, 2, 0, 3, 1, 1, 1, 0, 0, 2, 1, 1, 1, 0, 1, 1, 1, 2,
             1, 3, 8, 4, 4, 7, 4, 10, 4, 7, 9, 9, 10, 10, 5, 6, 2, 2, 1, 4, 3, 4, 2, 3, 0, 0, 5, 3, 4, 7, 3, 5, 2, 2, 3,
             3, 3, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 2, 1, 1, 3, 5, 4, 5, 11, 5, 4, 4, 5, 9, 9, 2, 4, 6, 2, 6, 2, 3,
             7, 5, 0, 7, 1, 6, 4, 1, 1, 9, 4, 4, 3, 2, 2, 3, 2, 3, 0, 5, 1, 1, 0, 0, 2, 0, 2, 0, 0, 3, 1, 2, 3, 6, 3,
             11, 9, 16, 14, 9, 18, 18, 22, 22, 19, 7, 8, 17, 8, 25, 18, 19, 20, 9, 18, 13, 14, 13, 3, 6, 12, 10, 18, 16,
             17, 10, 10, 11, 8, 4, 2, 4, 6, 4, 3, 4, 1, 2, 2, 0, 1, 0, 6, 3, 5, 0, 4, 3, 4, 3, 5, 4, 3, 2, 7, 2, 1, 1,
             2, 4, 1, 3, 4, 1, 2, 3, 3, 0, 0, 0, 0, 0, 0, 0, 4, 0, 3, 3, 2, 4, 0, 1, 1, 1, 0, 1, 1, 3, 1, 3, 0, 1, 3, 4,
             5, 3, 2, 6, 3, 6, 9, 6, 11, 9, 13, 15, 9, 13, 17, 15, 19, 18, 20, 14, 11, 5, 6, 8, 7, 2, 2, 8, 5, 5, 2, 5,
             8, 3, 0, 3, 3, 2, 2, 5, 8, 3, 5, 1, 1, 3, 0, 1, 0, 1, 1, 0, 2, 0, 0, 1, 1, 0, 3, 4, 3, 0, 6, 6, 9, 7, 15,
             28, 48, 40, 19, 18, 18, 20, 14, 13, 6, 1, 0, 0, 0, 0, 0, 1, 17, 10, 8, 12, 10, 5, 13, 10, 5, 4, 11, 4, 1,
             5, 1, 1, 0, 2, 4, 1, 2, 2, 1, 1, 0, 7, 3, 2, 4, 11, 3, 3, 0, 4, 3, 7, 11, 7, 3, 6, 2, 2, 4, 1, 4, 2, 2, 2,
             0, 0, 0};

    static final double[] vec3 =
            {1, 20, 63, 45, 29, 38, 25, 14, 11, 11, 4, 9, 4, 13, 10, 10, 11, 6, 15, 14, 22, 9, 12, 9, 10, 8, 6, 7, 7, 7,
             15, 16, 27, 14, 26, 10, 32, 39, 43, 29, 30, 45, 17, 10, 12, 79, 79, 71, 51, 76, 80, 54, 64, 78, 122, 102,
             99, 101, 88, 89, 82, 57, 46, 42, 36, 22, 24, 18, 8, 18, 7, 15, 13, 5, 11, 8, 12, 12, 17, 11, 16, 16, 23,
             34, 26, 19, 22, 15, 17, 7, 16, 13, 7, 16, 6, 16, 13, 21, 23, 13, 24, 14, 13, 11, 4, 12, 23, 16, 21, 14, 12,
             16, 9, 17, 13, 6, 7, 7, 4, 7, 5, 2, 6, 3, 6, 6, 5, 3, 6, 11, 15, 17, 13, 13, 18, 29, 39, 43, 61, 43, 59,
             64, 59, 42, 45, 63, 60, 37, 29, 35, 36, 35, 35, 34, 28, 29, 22, 28, 44, 29, 24, 18, 19, 14, 16, 22, 6, 11,
             8, 9, 10, 5, 0, 5, 3, 7, 7, 6, 3, 5, 2, 5, 9, 8, 9, 17, 19, 24, 13, 10, 27, 28, 23, 21, 23, 22, 13, 19, 20,
             24, 17, 30, 30, 43, 43, 36, 30, 50, 50, 47, 41, 38, 37, 39, 30, 29, 10, 23, 18, 9, 6, 10, 10, 5, 13, 3, 11,
             7, 9, 9, 10, 10, 8, 9, 20, 9, 23, 25, 45, 51, 76, 90, 138, 95, 97, 77, 89, 110, 77, 72, 71, 3, 0, 45, 136,
             132, 79, 133, 97, 82, 79, 35, 40, 45, 33, 26, 27, 32, 33, 27, 33, 20, 24, 21, 12, 12, 7, 11, 2, 11, 6, 13,
             7, 5, 6, 4, 7, 13, 10, 25, 23, 40, 28, 64, 72, 77, 147, 190, 243, 290, 247, 218, 182, 184, 196, 184, 176,
             175, 142, 109, 98, 71, 45, 62, 49, 73, 47, 27, 30, 26, 17, 17, 34, 28, 25, 20, 15, 11, 11, 17, 15, 12, 9,
             10, 8, 16, 16, 13, 15, 19, 12, 18, 14, 21, 11, 16, 16, 13, 12, 8, 18, 15, 17, 15, 16, 13, 13, 11, 12, 17,
             13, 11, 8, 8, 2, 1, 3, 9, 11, 9, 11, 11, 12, 9, 5, 6, 8, 6, 9, 10, 7, 20, 9, 10, 11, 10, 12, 11, 9, 22, 14,
             25, 18, 21, 36, 43, 41, 51, 55, 52, 58, 43, 46, 69, 72, 27, 37, 44, 37, 53, 31, 63, 62, 68, 43, 59, 70, 41,
             40, 61, 69, 54, 71, 90, 58, 76, 30, 35, 38, 38, 36, 33, 34, 33, 37, 27, 34, 41, 37, 43, 48, 58, 48, 66, 95,
             121, 158, 142, 188, 223, 144, 169, 148, 132, 139, 139, 127, 99, 88, 76, 60, 47, 36, 48, 55, 39, 49, 44, 31,
             21, 28, 47, 42, 43, 31, 47, 25, 15, 24, 26, 13, 7, 4, 3, 12, 8, 10, 20, 10, 10, 6, 12, 11, 24, 23, 17, 21,
             26, 53, 47, 66, 92, 84, 69, 68, 64, 62, 95, 67, 87, 75, 91, 108, 100, 99, 164, 137, 125, 96, 119, 100, 78,
             47, 77, 61, 70, 66, 53, 69, 48, 33, 49, 49, 45, 53, 24, 32, 32, 14, 18, 18, 12, 17, 11, 10, 29, 26, 24, 40,
             35, 50, 58, 71, 103, 95, 131, 160, 123, 139, 128, 146, 143, 152, 142, 132, 118, 163, 130, 130, 100, 117,
             109, 62, 72, 52, 37, 37, 27, 33, 28, 20, 25, 21, 14, 13, 7, 5, 9, 12, 7, 17, 5, 8, 9, 9, 10, 9, 17, 7, 18,
             15, 24, 29, 20, 44, 55, 54, 68, 68, 59, 94, 83, 86, 60, 50, 53, 27, 40, 48, 75, 62, 74, 80, 67, 69, 51, 27,
             43, 82, 55, 56, 58, 54, 63, 33, 41, 36, 33, 42, 30, 18, 30, 26, 26, 23, 22, 15, 20, 25, 28, 37, 39, 32, 57,
             55, 67, 57, 76, 111, 117, 131, 113, 133, 124, 123, 97, 104, 72, 72, 77, 31, 34, 47, 53, 54, 47, 46, 22, 13,
             15, 55, 62, 77, 42, 65, 40, 43, 51, 44, 32, 37, 34, 21, 32, 28, 24, 14, 12, 19, 10, 11, 20, 15, 17, 30, 35,
             47, 50, 53, 54, 44, 29, 23, 49, 52, 60, 44, 54, 62, 37, 70, 40, 36, 47, 57, 33, 52, 41, 51, 39, 25, 19, 33,
             43, 33, 51, 56, 40, 49, 45, 53, 40, 30, 33, 17, 9, 9, 13, 10, 15, 14, 10, 12, 13, 17, 40, 28, 56, 119, 156,
             201, 190, 172, 223, 176, 176, 232, 239, 151, 125, 140, 128, 152, 141, 173, 128, 112, 118, 99, 107, 91, 47,
             41, 57, 133, 166, 144, 146, 141, 114, 122, 85, 49, 52, 40, 49, 43, 37, 45, 46, 44, 59, 25, 46, 48, 43, 65,
             56, 54, 93, 58, 62, 65, 84, 66, 76, 104, 52, 56, 44, 66, 51, 66, 49, 39, 67, 65, 50, 59, 36, 0, 0, 0, 0, 0,
             0, 2, 89, 40, 54, 60, 60, 41, 35, 41, 27, 52, 32, 32, 18, 25, 52, 29, 19, 14, 34, 25, 39, 27, 67, 83, 66,
             77, 106, 85, 87, 134, 173, 162, 203, 249, 283, 193, 225, 184, 174, 158, 146, 130, 101, 121, 60, 61, 99,
             103, 117, 87, 64, 91, 143, 156, 111, 96, 110, 106, 87, 88, 98, 53, 55, 47, 50, 55, 49, 34, 17, 30, 35, 40,
             54, 33, 21, 15, 28, 30, 41, 64, 54, 12, 208, 183, 253, 329, 326, 453, 484, 322, 287, 280, 240, 172, 156,
             130, 103, 31, 0, 0, 0, 0, 0, 17, 162, 112, 118, 110, 111, 104, 123, 141, 111, 74, 102, 74, 69, 68, 51, 52,
             53, 43, 45, 42, 52, 41, 48, 34, 50, 70, 57, 72, 104, 87, 90, 100, 117, 113, 117, 158, 137, 132, 94, 117,
             103, 71, 82, 95, 113, 92, 64, 70, 39, 10, 4};

    static final double[] c3v1 =
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0,
             0, 0, 1.267786838, 2.535573676, 2.535573676, 1.267786838, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 49, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 0, 49, 0, 0, 0, 0, 0, 0, 0, 0, 1.267786838, 1.267786838, 1.267786838, 0, 0,
             0, 1.267786838, 1.267786838, 2.535573676, 1.267786838, 1.267786838, 0, 0, 0, 0, 0, 1.267786838,
             1.267786838, 50.26778684, 0, 0, 0, 0, 0.463850109, 0.463850109, 0.463850109, 0, 0, 0, 0, 0, 0, 0, 0, 49,
             49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 1.267786838, 1.267786838, 1.267786838, 0, 0, 0, 0.463850109,
             0.463850109, 0.463850109, 0, 0, 0, 0, 3.913538149, 0, 1.267786838, 1.267786838, 1.267786838, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 49, 49, 0, 0, 0.463850109, 0.463850109, 0.927700219, 0.463850109, 0.532895077,
             0.069044968, 0.069044968, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.267786838, 5.181324987, 10.47282761, 6.612020569, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 1.267786838, 2.535573676,
             2.535573676, 1.267786838, 0, 0.069044968, 0.138089935, 0.138089935, 2.008918629, 1.939873661, 1.939873661,
             0, 0, 0, 2.023715784, 3.357638235, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2.513240263, 0.463850109,
             0.927700219, 0.927700219, 0.463850109, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 49, 0, 0, 0,
             0, 0.463850109, 0.927700219, 1.391550328, 0.996745186, 0.532895077, 3.879747322, 1.672612419, 3.345224838,
             3.345224838, 1.672612419, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 1.267786838, 1.267786838, 1.267786838,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 0, 49, 0, 0, 0.997250858, 0.997250858, 0.997250858,
             0, 0, 0, 0, 0, 0, 0, 0.463850109, 0.463850109, 1.731636947, 1.267786838, 1.267786838, 1.939873661,
             1.939873661, 1.939873661, 0.815682598, 0.815682598, 0.815682598, 0, 0, 0, 0, 0, 0, 0, 1.267786838,
             1.267786838, 2.535573676, 3.781027101, 1.267786838, 1.939873661, 1.939873661, 1.939873661, 0.270214698,
             0.270214698, 1.651867256, 1.381652558, 1.381652558, 0, 0, 0, 0, 0, 0, 0, 0.069044968, 0.138089935,
             0.138089935, 0.069044968, 0, 0, 0, 0, 0, 2.513240263, 0.463850109, 0.463850109, 0.463850109, 0, 0, 0, 0, 0,
             0, 0, 0, 1.267786838, 1.267786838, 1.267786838, 0, 0, 0, 0, 0, 0, 0, 49, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 0, 1.267786838, 1.267786838, 5.181324987, 0, 4.562630416, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0.069044968, 2.58228523, 0.069044968, 0.463850109, 0.463850109, 0.463850109, 0, 0, 0,
             0, 0, 2.513240263, 0, 0, 0, 0.997250858, 0.997250858, 0.997250858, 0, 0, 0, 0, 0, 0, 0.700840129,
             4.511542483, 1.164690238, 0.463850109, 0.463850109, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 49, 49, 0, 0, 0, 0, 1.939873661,
             1.939873661, 2.008918629, 0.069044968, 0.069044968, 0, 0, 0, 0, 2.086660417, 2.513240263, 0.463850109,
             0.463850109, 0.463850109, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 49, 0, 0, 0.463850109, 0.463850109,
             0.463850109, 0, 0, 0.463850109, 0.463850109, 1.731636947, 1.267786838, 1.731636947, 9.125260832,
             0.463850109, 7.552359741, 0, 0.611645928, 0.611645928, 1.044736376, 0.619047237, 0.619047237, 0.185956789,
             0.725163898, 0.725163898, 0.725163898, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 99, 0, 0, 0, 0,
             0, 0.997250858, 1.994501716, 1.994501716, 0.997250858, 0, 0, 0, 0, 0, 0, 0, 1.267786838, 50.26778684,
             100.2677868, 1.267786838, 1.267786838, 1.267786838, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0,
             3.913538149, 0, 1.267786838, 2.265037696, 2.265037696, 0.997250858, 0, 0, 0, 1.381652558, 1.381652558,
             1.381652558, 0, 0.15549333, 0.15549333, 0.15549333, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.939873661, 3.879747322,
             3.94879229, 2.008918629, 0.069044968, 0, 0, 1.449489743, 1.449489743, 1.449489743, 0, 1, 1, 1, 0, 0, 0,
             0.069044968, 0.069044968, 0.069044968, 0, 0, 0, 0, 0, 0, 0, 1.267786838, 1.267786838, 1.267786838,
             0.069044968, 0.069044968, 0.069044968, 0, 0, 0, 0, 0, 0, 1.267786838, 1.267786838, 1.267786838, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 49, 0, 49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 49, 0, 0, 0, 0, 1.267786838,
             1.267786838, 1.267786838, 0.463850109, 0.927700219, 0.927700219, 2.977090372, 1.939873661, 5.750576015,
             1.939873661, 1.381652558, 4.618461434, 4.618461434, 1.694532279, 1.694532279, 1.694532279, 0.540657773,
             0.540657773, 0.540657773, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.61023512, 0.61023512, 0.61023512, 0.270214698,
             0.540429395, 0.540429395, 0.270214698, 0, 0, 0, 0, 0, 0, 0, 0.224744871, 0.224744871, 0.224744871, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0.463850109, 2.977090372, 0.927700219, 0.463850109, 0.463850109, 0, 0, 0, 0, 0.656157342,
             1.356997471, 1.356997471, 0.700840129, 0, 4.589531031, 1.691255681, 7.729924387, 2.155105791, 0.463850109,
             0.463850109, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2.513240263, 0, 199, 0, 0, 0, 0, 0, 0, 0, 0, 0.414213562,
             0.414213562, 1.115053691, 0.700840129, 0.700840129, 0.528530513, 0.528530513, 0.528530513, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 4.715966139, 1.381652558, 1.381652558, 1.381652558, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0};

    static final double[] c3v2 =
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.323790008, 1.323790008, 1.323790008, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0.656157342, 5.245688373, 0.898275349, 0.242118007, 0.667511297, 0.42539329, 0.787155239,
             0.361761949, 0.973407877, 2.054788187, 2.054788187, 3.380513748, 1.937371488, 1.937371488, 0, 1.004459314,
             1.089242909, 1.089242909, 0.084783595, 0.020957703, 0.020957703, 1.039399464, 1.018441761, 1.141163544,
             0.859919855, 2.799793516, 3.409122541, 2.671924469, 0.732050808, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 1.267786838, 1.267786838, 3.207660499, 1.939873661, 1.939873661, 0, 0, 3.554432692, 0.656157342,
             5.659727709, 0.656157342, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.351690671, 0.351690671, 0.351690671, 0, 0, 0,
             0, 0, 0, 0, 2.175536744, 0, 0, 0.823369223, 0.823369223, 0.823369223, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0.069044968, 3.879747322, 0.532895077, 7.075870678, 1.518060473, 1.123255332, 1.162657632, 0.533840559,
             0.464795591, 1.693180128, 6.013903539, 3.748224365, 4.840936685, 0.970816045, 1.237281594, 1.237281594,
             0.266465549, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 1.939873661, 1.939873661, 2.40372377, 0.463850109, 0.463850109, 0, 2.086660417, 2.268228676,
             4.628616054, 0, 0.380585035, 0.529906284, 0.529906284, 0.14932125, 0, 0, 1.049002855, 1.049002855,
             3.218434376, 0, 0.044465936, 0.044465936, 0.044465936, 0, 0, 0.826828286, 0.826828286, 0.826828286,
             0.997250858, 4.11279808, 2.280857029, 1.283606171, 1.283606171, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 3.913538149, 1.267786838, 1.267786838, 4.806993333, 0, 0, 0, 0, 0, 0.309307341, 0.773157451,
             3.306326379, 0.571822539, 3.350613117, 5.344386235, 2.608026766, 0.086749779, 0.086749779, 0.086749779,
             0.480360853, 0.480360853, 0.480360853, 0, 0, 0, 0, 0.528798005, 1.415781588, 1.941302707, 2.057658635,
             1.170675052, 0.645153933, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.951800146, 1.220470241, 1.220470241, 0.268670095,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.939873661, 7.621404709, 1.939873661, 2.086660417,
             2.273268354, 2.268228676, 5.286486008, 4.494209261, 6.152474728, 5.808591238, 4.250921492, 0.632993162,
             0.632993162, 0.632993162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.737198072, 0.737198072, 0.737198072, 0, 0, 0, 0, 0, 0,
             0.540657773, 0.540657773, 0.540657773, 0, 0.528530513, 0.528530513, 1.260581321, 0.732050808, 0.732050808,
             0, 0, 0, 0, 0, 0, 0, 0.815682598, 0.815682598, 3.328922861, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.069044968,
             0.069044968, 0.069044968, 0, 0, 0.069044968, 0.138089935, 0.138089935, 4.631675383, 0.069044968,
             0.069044968, 1.123255332, 3.929498372, 2.994084025, 6.296020755, 3.161894743, 2.101675584, 2.101675584,
             2.077808621, 3.474247097, 1.19815412, 0.804221908, 0.93630544, 1.75063543, 0.946413522, 0.81432999, 0, 0,
             0, 0, 0, 0, 1.599473778, 1.599473778, 1.599473778, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 1.453753436, 5.008186127, 3.869577954, 3.430541643, 1.441247391, 2.526890122,
             2.998283124, 1.893427875, 0.807785144, 0.336392143, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0.278429727, 0.278429727, 0.278429727, 0, 0, 0, 0.022397265, 0.147034256, 0.147034256, 0.124636991, 0, 0,
             0, 0, 0, 0, 0, 0.815682598, 0.815682598, 0.815682598, 0, 0.815682598, 0.815682598, 0.815682598,
             0.351690671, 0.351690671, 0.703381341, 0.351690671, 2.806011273, 3, 6.621288186, 2.271671248, 0, 0, 0, 0,
             0.550115203, 0.550115203, 0.550115203, 0.149435119, 0.149435119, 1.921659861, 1.772224743, 1.772224743,
             3.644381175, 7.227241336, 2.590662494, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 4.562630416, 1.267786838, 2.265037696, 2.265037696, 2.583994803, 2.938329351, 2.938329351,
             5.221629063, 2.15120472, 1.451171507, 3.06978619, 3.06978619, 2.044007973, 1.801747393, 4.35269443,
             1.587469624, 0.294588199, 1.509364345, 1.298843886, 1.215371208, 1.132602225, 1.380186431, 2.309000038,
             1.176992874, 0.928813607, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             1.672612419, 1.672612419, 1.672612419, 0.700840129, 6.693182879, 1.516522727, 3.308773017, 0.815682598,
             1.035400978, 4.346855521, 1.035400978, 0.259881577, 0.259881577, 0.546416619, 0.286535042, 0.286535042, 0,
             0, 0, 0, 0, 0, 0.424507206, 3.540054428, 1.348788148, 2.362078543, 2.362078543, 1.437797601, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.656157342, 0.656157342, 5.325624438,
             11.12435565, 4.196152423, 1.853569194, 2.630433182, 2.630433182, 2.539976839, 1.763112851, 1.847896446,
             0.335202244, 0.603261163, 1.334160166, 1.508248723, 1.240189804, 0.424507206, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             1.054210364, 1.054210364, 1.060048125, 1.408843398, 1.408843398, 1.754696307, 0.351690671, 0.351690671, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.672612419, 1.672612419, 1.672612419, 2.023715784, 5.003570366,
             4.196152423, 2.90488416, 4.891883036, 0.588922693, 0.588922693, 0.588922693, 0, 0.413516734, 0.83802394,
             0.83802394, 0.424507206, 0, 0, 0, 0, 0, 0, 0, 0, 0.318469856, 0.318469856, 0.318469856, 0, 0, 0,
             0.676762309, 0.676762309, 0.676762309, 0, 0, 0, 0, 0, 0, 0, 1.381652558, 1.381652558, 1.381652558, 0, 0, 0,
             0, 0, 0, 0, 1.381652558, 1.381652558, 1.845502668, 1.013043448, 4.010738636, 1.077723852, 6.93849428,
             2.769604297, 6.058829058, 1.90972655, 1.966267637, 3.076293623, 1.943431061, 3.640623536, 3.619182717,
             3.215912403, 1.462178841, 0.373593674, 0, 0, 0.397109398, 0.397109398, 0.397109398, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0.388174991, 0.388174991, 1.044332333, 0.656157342, 0.656157342, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 1.482767355, 1.482767355, 3.038760517, 1.555993162, 1.555993162, 0, 0, 0, 0, 0, 0, 0, 1.316264097,
             1.316264097, 1.316264097, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.14698016, 1.14698016,
             150.1469802, 0.60634901, 0.60634901, 1.338399818, 0.732050808, 0.732050808, 0, 0, 0, 0, 0, 0.242118007,
             0.242118007, 3.926438357, 0, 0, 0.385869734, 1.551120687, 3.700824629, 1.190896141, 0.025645188,
             0.995921204, 0.970276016, 1.965662399, 3.237889257, 1.651543726, 4.013795578, 1.374974538, 2.98480352,
             2.546753913, 1.827936717, 2.261715017, 1.5422758, 2.122085383, 3.333515676, 3.087093692, 3.798571957,
             2.153363364, 1.291287847, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.058828604, 0.058828604, 0.058828604, 0, 0, 0,
             0, 0, 0.823369223, 0.823369223, 1.429718234, 0.60634901, 0.60634901, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             2.023715784, 3.34659144, 2.086660417, 0, 1.939873661, 3.61248608, 7.155927193, 2.726822783, 4.838250831,
             8.243022869, 13.60637374, 6.081162132, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.839408907, 4.864331266,
             16.64899009, 0.479384375, 0.479384375, 0.479384375, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 3.216541329, 0.069044968, 0.069044968, 0.069044968, 2.807545482, 0, 0, 0, 0, 0, 0, 1.078527483,
             1.078527483, 1.078527483, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    static final double[] c3v3 =
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.821773077, 1.353718618, 4.608967478, 0.531945542,
             0, 0, 0, 0, 0, 0, 0, 0, 2.180953772, 2.657347465, 12.97382758, 0.750328318, 3.698251872, 0.750328318,
             1.572917575, 3.433059594, 5.95400233, 1.954237232, 0.094095213, 0.553963081, 0.459867868, 0.459867868, 0,
             3.703503909, 2.682694458, 2.134121083, 0, 0.241449714, 0.349422144, 0.349422144, 0.10797243, 0,
             3.208537798, 1.887563096, 3.567945716, 3.663066878, 1.775503783, 0.095121163, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0.289006773, 0.289006773, 0.829664546, 0.817254518, 3.084874431, 6.231848746,
             2.91058012, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.899210512, 2.320120643, 2.320120643, 2.479732016,
             1.058821885, 1.058821885, 0, 0, 0, 0.10158211, 0.10158211, 0.460314551, 0.358732441, 0.358732441, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2.919831548, 5.15244135, 7.485281374, 1.708070645,
             2.061237076, 2.732495119, 3.5526359, 5.264033163, 6.373908644, 6.409664098, 1.289674432, 3.046587029,
             3.895070358, 3.053342568, 1.296429971, 0.447946642, 0.000626096, 0.000626096, 0.000626096, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 2.354392352, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             1.301173508, 1.897215965, 2.986147837, 5.647840096, 5.502059253, 5.357952414, 0.076828029, 0.076828029,
             1.076828029, 2.283986826, 2.751985227, 1.751985227, 0.467998401, 0, 0, 0, 0, 0, 0, 1.828724213,
             3.498643435, 8.598765122, 4.791388057, 1.187255635, 1.187255635, 2.162599777, 1.86199143, 2.440501598,
             1.465157456, 0.578510169, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.286974605, 0,
             12.22943147, 2.440783303, 7.257879928, 5.273978482, 7.184489022, 4.315334732, 5.837238191, 1.58152816,
             2.328517864, 2.328517864, 0.746989705, 0, 0, 0, 0, 0, 0, 0, 0.959925148, 1.654691574, 1.654691574,
             1.289779563, 0.595013137, 0.595013137, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0.576146076, 0.576146076, 5.807828704, 3.125002868, 9.50196991, 1.464751509, 6.628436312,
             4.775154887, 3.829453203, 5.437427762, 5.699601653, 7.377802583, 4.348129669, 1.699431501, 1.991429298,
             1.991429298, 0.291997798, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0.101377584, 0.453068254, 0.453068254, 0.351690671, 0.97381447, 0.97381447, 1.608300832,
             0.634486362, 1.575829027, 0.941342665, 0.941342665, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0.276884796, 0.553769592, 1.011561768, 0.734676972, 0.457792176, 0, 0, 0, 0, 0, 0,
             4.037912471, 0, 0.508379953, 0.508379953, 0.508379953, 0, 0, 0, 1.580587477, 1.580587477, 13.8045667,
             0.315978514, 1.205052287, 3.603137535, 4.424898748, 2.986751426, 2.522910498, 1.854511077, 2.893714377,
             3.85828015, 2.003769073, 0.964565773, 1.598076211, 4.052396814, 1.598076211, 0, 0, 0, 0, 0, 0, 0,
             0.628511873, 0.628511873, 0.628511873, 0.331816805, 0.331816805, 0.331816805, 0, 0, 0, 0.266415377,
             1.949877293, 1.949877293, 2.03009952, 0.346637604, 0.346637604, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.439374807,
             1.439374807, 3.423792009, 4.237692785, 6.339965723, 1.254407448, 4.385306032, 5.62734422, 8.571600216,
             9.790714273, 3.388072322, 3.115121833, 2.293965375, 0.058201598, 0.093873418, 0.093873418, 0.03567182, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 1.952927398, 3.681175538, 4.019225135, 2.282419367, 1.323079593, 5.5952123, 4.269614319, 6.90418816,
             4.026571049, 2.858675147, 0.729779715, 0.729779715, 0.729779715, 0, 0.679565222, 0.679565222, 0.992031331,
             0.312466109, 0.81942649, 2.264301247, 3.341533448, 3.42572367, 5.581776276, 2.976809558, 1.437353794,
             1.437353794, 1.437353794, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0.044941017, 0.265876408, 2.121607982, 4.70150886, 3.192684781, 4.358903908, 3.67410326, 3.07649372,
             4.679684511, 3.514621022, 4.084671691, 3.000853564, 1.214274841, 2.038477175, 2.038477175, 0.960458183,
             0.13625585, 0.348517336, 0.212261487, 0.212261487, 0, 1.360973009, 1.360973009, 1.360973009, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.900038648, 0.900038648, 2.212430963,
             1.801729738, 5.103367871, 3.563497034, 0.780379737, 4.739324484, 4.672587997, 4.098522153, 2.875288008,
             1.606733438, 2.101312386, 3.971074222, 3.244487324, 3.759819142, 1.890057306, 1.009910766, 0, 0, 0, 0, 0,
             0, 0.201988402, 1.162042258, 1.225375167, 1.023386765, 0.063332909, 0, 0, 0.42539329, 0.42539329,
             0.42539329, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.005837761, 1.865797254, 5.05887268,
             3.014688511, 4.881320842, 3.38152035, 3.454113878, 0.899162495, 2.839624328, 6.347781786, 6.142681766,
             4.034824057, 0.97112375, 2.097348742, 2.259081245, 1.287957495, 0.161732503, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0.025160194, 0.375537965, 1.637172781, 1.612012587, 1.650200648, 0.388565832, 0.388565832, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.688340413, 6.008311542, 8.772317681, 3.858032962,
             2.510480245, 1.25309981, 1.25309981, 1.25309981, 0, 0, 0, 0.413232491, 0.413232491, 0.413232491,
             0.292043419, 0.292043419, 1.172334247, 0.880290829, 0.880290829, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
             0.116122831, 0.946211645, 0.946211645, 1.153229124, 0.32314031, 0.429809912, 0.106669602, 0.106669602, 0,
             0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.222231241, 12.63206477, 8.407469191, 15.65382839, 8.915062683, 11.52064741,
             9.161992333, 2.925078157, 1.011135815, 1.908123536, 1.908123536, 0.89698772, 0.280177862, 1.145288723,
             1.145288723, 0.865110862, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.237747429, 1.738856296, 2.798377908,
             3.413462645, 1.961800732, 0.90227912, 0.049446954, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.599734734, 1.599734734,
             1.599734734, 0, 0, 1.118200853, 1.239850098, 1.239850098, 2.71188494, 0, 0.103080201, 0.103080201,
             0.598217827, 0.495137626, 0.495137626, 1.425804825, 1.425804825, 1.425804825, 0, 0, 0, 0, 0, 0, 0,
             0.205353607, 0.205353607, 0.205353607, 0, 0, 0, 0, 0, 0, 0, 0, 2.128535286, 1.561759206, 71.61908013,
             1.963859592, 0.604532155, 0.604532155, 0.202431768, 0, 0, 0, 0, 0, 0, 0, 0.795417705, 0.795417705,
             0.795417705, 0, 0, 0, 0, 0, 2.148042967, 3.117489881, 3.622229562, 1.558149152, 3.173560401, 3.756337664,
             2.534219846, 2.454804167, 4.983159164, 6.434059602, 3.993376031, 2.855146993, 3.246145567, 0.258119062,
             0.409237898, 0.409237898, 0.151118836, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1.046351023, 3.151451205,
             1.131807553, 0.08545653, 0.08545653, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.004039097, 0.004039097,
             0.004039097, 0, 0, 0, 0, 1.477189034, 2.234186994, 2.234186994, 10.71824083, 7.255142103, 10.287806,
             3.01084477, 2.098647503, 2.52468774, 1.786195889, 1.810900496, 1.810900496, 0.024704606, 0, 0, 0, 0, 0, 0,
             0, 0, 0, 0, 0, 0, 1.237450368, 2.634364788, 10.60578195, 1.792611856, 0.431066493, 0.431066493,
             0.035369057, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.919373354, 1.363331339, 4.815623707,
             5.247144435, 2.192690285, 1.600935083, 2.272679159, 3.381453277, 2.732396341, 3.053680377, 4.334208029,
             2.498670097, 2.766845974, 2.766845974, 1.261203989, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void setUp() throws Exception {
    }

    @Override
    protected void tearDown() throws Exception {
    }

    public void testEarsC3detector() {
        double[] output;
//
        System.out.println("Testing Ears C3");
        output = Ears.gettestC3(vec1);
        for (int i = 0; i < output.length; i++) {
            assertEquals(c3v1[i], output[i], 0.00001);
        }
        output = Ears.gettestC3(vec2);
        for (int i = 0; i < output.length; i++) {
            assertEquals(c3v2[i], output[i], 0.00001);
        }
        output = Ears.gettestC3(vec3);
        for (int i = 0; i < output.length; i++) {
            assertEquals(c3v3[i], output[i], 0.00001);
        }
    }
}