package com.barcode.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.barcode.util.Barcode;
import com.google.zxing.EncodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

@RestController
public class BarcodeController {

	   private static final String BAR_CODE_PATH = "d:/";
	  
	   @Autowired
	   private Barcode barcode;
//	
//	   @GetMapping(value = "/barcode/generate/{barcodeText}/width/{width}/height/{height}")
//	   public void generateBarcode(@PathVariable("barcodeText") String barcodeText,@PathVariable("width") int width,@PathVariable("height") int height) throws WriterException, IOException {
//		       barcode.generateBarCodeImage(barcodeText, width, height, BAR_CODE_PATH + barcodeText + ".png");
//	   }
//	   
//	   @GetMapping(value = "/barcode/read/{barcodeText}")
//	   public String barcodeReader(@PathVariable String barcodeText) throws FileNotFoundException, NotFoundException, IOException {
////		     Path path = Paths.get(BAR_CODE_PATH + barcodeText + ".png");
//		     String charset = "UTF-8";
//		     Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<>();
//		     return barcode.readBarCode(BAR_CODE_PATH + barcodeText + ".png" , charset, hashMap);
//		   
//	   }
//	   
//	 @GetMapping(value = "/barcode/readstream/{barcodeText}/width/{width}/height/{height}")
//	   public byte[] barcodeResponse(@PathVariable(name = "barcodeText") String barcodeText, @PathVariable(name = "width") int width, @PathVariable(name = "height") int height) throws FileNotFoundException, NotFoundException, IOException, WriterException {
////		     Path path = Paths.get(BAR_CODE_PATH + barcodeText + ".png");
//		     String charset = "UTF-8";
//		     Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<>();
//		     return barcode.getQrCodeImage(barcodeText, width, height);
//		   
//	   }   
	 

}
