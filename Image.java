/**
 * 
 */
package Exercise2_3;

/**
 *  represent information about an image
 * @author Nguyễn Viên
 *
 */
public class Image {
	int width; // in pixels
	int height; // in pixels
	String source; // file name
	String quality; // informal
	/**
	 * This is Image's constructor to create Image object which input:
	 * @param width : int ,Image's weight
	 * @param height : int, Image's height
	 * @param source: String, Image's soure 
	 * @param quality: String, Image's quality
	 * Example: new Image(5, 10, "small.gif", "low");
	 *Image i1 = new Image(120, 200, "med.gif", "low");
	 *Image i2 = new Image(1200, 1000, "large.gif", "high");
	 */

	Image(int width, int height, String source, String quality) {
		this.width = width;
		this.height = height;
		this.source = source;
		this.quality = quality;
		
	}

	/**
	 * isPortait which determine whether the image's height is large than its width
	 * @return: true/false: true if the Image's hieght is larger than its width else false
	 * Example: new Image(5, 10, "small.gif", "low").isPortait(): true
	 * new Image(120, 200, "med.gif", "high").isPortait(): true 
	 * new Image(1200, 1000, "large.gif", "low").isPortait(): false
	 */
	boolean isPortait() {
		return this.height > this.width;
	}

	/**
	 * size which computes how many pixels the image contains(Size = width*height)
	 * @return int : size of Image
	 * Example: Image(5, 10, "small.gif", "low").size():50
	 * Image i1 = new Image(120, 200, "med.gif", "low");
	 * Image i2 = new Image(1200, 1000, "large.gif", "high");
	 * i1.Size():24000
	 * i2.Size():1200000
	 */
	public int Size() {
		return this.height * this.width;
	}

	/**
	 * isLarger which determines whether one image contains more pixels than some other image
	 * It mean that this Image'size more than other's size.
	 * Note: size = width*height
	 * @param other
	 * @return true/false (boolean)
	 * Example : Image i1 = new Image(10, 20, "med.gif","high")
	 * new Image(5, 10, "small.gif", "low").isLarger(i1):false
	 * Image i2 = new Image(30, 40, "large.gif", "high");
	 * new Image(120, 200, "med.gif", "high").isLarger(i2: true
	 */
	boolean isLarger(Image other) {
		return this.width * this.height > other.width * other.height;
	}

	/**
	 * same which determines whether this image is the same as a given one
	 * @param other
	 * @return true/false( boolean) : true if this image's all attributes are the same as other's all attributes else false
	 * Example:new Image(5, 10, "small.gif", "low").same(new Image(5, 10, "small.gif", "low")): true
	 * (new Image(1200, 1000, "large.gif", "high").same(new Image(30, 40, "med.gif", "high"): false
	 */

	boolean same(Image other) {
		return this.width == (other.width) 
				&& this.height == (other.height)
				&& this.source.equals(other.source)
				&& this.quality.equals(other.quality);

	}

	/**
	 * sizeString produces one of three strings, depending on the number of pixels in the image:
	 * "small" for images with 10,000 pixels or fewer;
	 * "medium" for images with between 10,001 and 1,000,000 pixels; 
	 * "large" for images that are even larger than that
	 * @return {"small","medium","large"}(String)
	 * Example : new Image(5, 10, "small.gif", "low").sizeString(), "small")
	 * Image i1 = new Image(120, 200, "med.gif", "high")
	 * i1.sizeString(),"medium"
	 * Image i2 = new Image(1200, 1000, "large.gif", "low")
	 * i2.sizeString(),"large"
	 */
	String sizeString() {
		if (0 <= this.Size() && this.Size() <= 10000) {
			return "small";
		} else {
			if (10001 <= this.Size() && this.Size() <= 1000000) {
				return "medium";
			} else {
				return "large";
			}
		}

	}

}
