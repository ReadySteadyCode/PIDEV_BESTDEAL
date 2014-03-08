/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.entities;

/**
 *
 * @author Internet
 */
public class ImageDeal {
    private int idDealImage;

    public ImageDeal() {
    }
    private int idDeal;
    private byte [] Image;

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
