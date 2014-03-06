/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.entities;

/**
 *
 * @author user
 */
public class ImageDeal {
    private int idDealImage;
    private int idDeal;
    private byte [] Image;

    public ImageDeal(int idDealImage, int idDeal, byte[] Image) {
        this.idDealImage = idDealImage;
        this.idDeal = idDeal;
        this.Image = Image;
    }
  public ImageDeal ()
  {
  }

    public int getIdDealImage() {
        return idDealImage;
    }

    public void setIdDealImage(int idDealImage) {
        this.idDealImage = idDealImage;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public byte[] getImage() {
        return Image;
    }

    public void setImage(byte[] Image) {
        this.Image = Image;
    }
  
    
}
