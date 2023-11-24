package org.example;

import java.util.ArrayList;
import java.util.List;

public class PaperCutterV1_Final_Tested {
    public static List<CutPiece> cutPaperRoll_Horizontally(PaperRoll paperRoll, double cutLength, double cutWidth) {
        List<CutPiece> cutPieces_1st_Method = new ArrayList<>();

        double remainingLength = paperRoll.getLength();
        double remainingWidth = paperRoll.getWidth();
        int rowIndex=1;

        //// ADWA PAPER ADVA JOB 
        while (remainingLength >= cutLength && remainingWidth >= cutWidth) {

         int   noOfCuts= (int) (remainingWidth/cutWidth);
            remainingLength = remainingLength-cutLength;


            for (int i=1; i<=noOfCuts; i++)
            {
            remainingWidth=remainingWidth-cutWidth;
            CutPiece cutPiece = new CutPiece(cutLength, cutWidth);
            cutPiece.setRem_length(remainingLength);
            cutPiece.setRem_width(remainingWidth);
            cutPiece.setDesc(rowIndex+" ROW");
            cutPieces_1st_Method.add(cutPiece);

            }



           //// With Sould Be Reset while Next Row Come
            remainingWidth = paperRoll.getWidth();
            rowIndex=rowIndex+1;
        }

        ///ADWA PAPER UBHA JOB

//        while (remainingLength < cutLength && remainingLength>=cutWidth){
//
//            ///// HERE CUT PAGE NOW HORIZONTAL HERE LENGHT
//            int   qtyVertical= (int) (remainingWidth/cutLength);
//            remainingLength = remainingLength-cutWidth;
//            remainingWidth=remainingWidth;
//
//            for (int i=1; i<=qtyVertical; i++)
//            {
//
//                CutPiece cutPiece = new CutPiece(cutLength, cutWidth);
//                cutPiece.setRem_length(remainingLength);
//                cutPiece.setRem_width(remainingWidth-(cutWidth*qtyVertical));
//                cutPieces_1st_Method.add(cutPiece);
//
//            }
//
//
//        }
        

        return cutPieces_1st_Method;
    }




    public static void main(String[] args) {

//
//        for (CutPiece cutPiece : cutPaperRoll_Horizontally(new PaperRoll(19.4, 29.8), 8.5, 11)) {
//            System.out.println("ADWA PAPER ADWA JOB...... \n"+cutPiece);
//        }
//
//


        double cutLength=11.4;
        double cutWidth=20;
        System.out.println("CUT SIZE ==== "+cutLength+"X"+cutWidth);
        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("12X25 "+cutPaperRoll_Horizontally(new PaperRoll(11.4,24.8),cutLength,cutWidth).size());
        System.out.println("12x25 "+cutPaperRoll_Vertically(new PaperRoll(11.4,24.8),cutLength,cutWidth).size());

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("12X23 "+cutPaperRoll_Horizontally(new PaperRoll(11.4,22.8),cutLength,cutWidth).size());
        System.out.println("12x23 "+cutPaperRoll_Vertically(new PaperRoll(11.4,22.8),cutLength,cutWidth).size());

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("18X25 "+cutPaperRoll_Horizontally(new PaperRoll(17.4,24.8),cutLength,cutWidth).size());
        System.out.println("18x25 "+cutPaperRoll_Vertically(new PaperRoll(17.4,24.8),cutLength,cutWidth).size());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("18X23 "+cutPaperRoll_Horizontally(new PaperRoll(17.5,22.8),cutLength,cutWidth).size());
//        for (CutPiece cutPiece : cutPaperRoll_Horizontally(new PaperRoll(17.4, 22.8), cutLength, cutWidth)) {
//            System.out.println("ADWA PAPER ADWA  JOB...... \n"+cutPiece);
//        }
        System.out.println("18x23 "+cutPaperRoll_Vertically(new PaperRoll(17.5,22.8),cutLength,cutWidth).size());
//        for (CutPiece cutPiece : cutPaperRoll_Vertically(new PaperRoll(17.4, 22.8), cutLength, cutWidth)) {
//            System.out.println("ADWA PAPER UBHA  JOB...... \n"+cutPiece);
//        }

        System.out.println("-----------------------------------------------------------------------------");
//
        System.out.println("15X20 "+cutPaperRoll_Horizontally(new PaperRoll(14.4,19.8),cutLength,cutWidth).size());
////        for (CutPiece cutPiece : cutPaperRoll_Horizontally(new PaperRoll(14.4, 19.8), cutLength, cutWidth)) {
////            System.out.println("ADWA PAPER ADWA  JOB...... \n"+cutPiece);
////        }
        System.out.println("15x20 "+cutPaperRoll_Vertically(new PaperRoll(14.4,19.8),cutLength,cutWidth).size());
////        for (CutPiece cutPiece : cutPaperRoll_Vertically(new PaperRoll(14.4, 19.8), cutLength, cutWidth)) {
////            System.out.println("ADWA PAPER ADWA  JOB...... \n"+cutPiece);
////        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("20X30 (19.4 X 29.8) "+cutPaperRoll_Horizontally(new PaperRoll(19.5,29.8),cutLength,cutWidth).size());
//        for (CutPiece cutPiece : cutPaperRoll_Horizontally(new PaperRoll(19.5, 29.8), cutLength, cutWidth)) {
//            System.out.println("ADWA PAPER ADWA  JOB...... \n"+cutPiece);
//        }
        System.out.println("20X30 (19.4 X 29.8) "+cutPaperRoll_Vertically(new PaperRoll(19.5,29.8),cutLength,cutWidth).size());
        System.out.println("-----------------------------------------------------------------------------");
////
//        for (CutPiece cutPiece : cutPaperRoll_Vertically(new PaperRoll(19.5, 29.8), cutLength, cutWidth)) {
//            System.out.println("ADWA PAPER UBHA JOB XXXXXX  JOB...... \n"+cutPiece);
//        }



    }




    public static List<CutPiece> cutPaperRoll_Vertically(PaperRoll paperRoll, double cutLength, double cutWidth) {
        List<CutPiece> cutPieces_2st_Method = new ArrayList<>();

        double temp=cutLength;
        cutLength=cutWidth;
        cutWidth=temp;
        int rowIndex=1;
        /// If we Calculate In Vertically then keep in mind L>B . so need to swap
        double remainingLength = paperRoll.getLength();
        double remainingWidth = paperRoll.getWidth();

        //// ADWA PAPER UBHA JOB
        while (remainingLength >= cutLength && remainingWidth >= cutWidth) {

            int   noOfCuts= (int) (remainingWidth/cutWidth);
            remainingLength = remainingLength-cutLength;



            for (int i=1; i<=noOfCuts; i++)
            {
                remainingWidth=remainingWidth-cutWidth;
                CutPiece cutPiece = new CutPiece(cutLength, cutWidth);
                cutPiece.setRem_length(remainingLength);
                cutPiece.setRem_width(remainingWidth);
                cutPiece.setDesc(rowIndex + "ROW");
                cutPieces_2st_Method.add(cutPiece);

            }

            remainingWidth=paperRoll.getWidth();
            rowIndex=rowIndex+1;

        }


        //ADWA PAPER ADWA JOB.......

        while (remainingLength < cutLength && remainingLength>=cutWidth){

            ///// HERE CUT PAGE NOW HORIZONTAL HERE LENGHT
            int   qtyVertical= (int) (remainingWidth/cutLength);
            remainingLength = remainingLength-cutWidth;


            for (int i=1; i<=qtyVertical; i++)
            {
                remainingWidth=remainingWidth-cutLength;
                CutPiece cutPiece = new CutPiece(cutLength, cutWidth);
                cutPiece.setRem_length(remainingLength);
                cutPiece.setRem_width(remainingWidth);
                cutPiece.setDesc(rowIndex + "ROW INVERTED");
                cutPieces_2st_Method.add(cutPiece);

            }

            remainingWidth=paperRoll.getWidth();
            rowIndex=rowIndex+1;
        }


        return cutPieces_2st_Method;
    }

}