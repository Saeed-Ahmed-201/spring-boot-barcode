package com.barcode.util;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Component;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

@Component
public class Barcode {
	
	  
	   public void generateBarCodeImage(String barCodeText, int width, int height, String filePath) throws WriterException, IOException {
		   
//		    QRCodeWriter qrCodeWriter = new QRCodeWriter();
		    BitMatrix bitMatrix = new MultiFormatWriter().encode(barCodeText, BarcodeFormat.QR_CODE, width, height);
  
//		    BitMatrix bitMatrix =  qrCodeWriter.encode(barCodeText, BarcodeFormat.EAN_13, width, height);
		    Path path = Paths.get(filePath)	;
		    MatrixToImageWriter.writeToPath(bitMatrix, "png", path);
		    
		    
		    
	   }    
	   public String readBarCode(String path, String charset, Map hashMap) throws FileNotFoundException, IOException, NotFoundException {
		   BinaryBitmap binaryBitMap = new BinaryBitmap(
				                                          new HybridBinarizer(
						                                         new BufferedImageLuminanceSource(
						                                        		 ImageIO.read(new FileInputStream(path))
						                                        		 )));
		    Result result = new MultiFormatReader().decode(binaryBitMap);	
		    System.out.println(result.getText());
		    return result.getText();
	   }
	   
	   public byte[] getQrCodeImage(String barCodeText, int width, int height) throws WriterException, IOException {
		     QRCodeWriter qrCodeWriter = new QRCodeWriter();
		     ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		 
		     BitMatrix bitMatrix = qrCodeWriter.encode(barCodeText, BarcodeFormat.QR_CODE, width, height);
		     MatrixToImageWriter.writeToStream(bitMatrix, "png", byteOutputStream);
		     
		     byte[] pngData = byteOutputStream.toByteArray();
		     return pngData;
	   }

}
