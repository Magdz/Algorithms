from PIL import Image
import utilities

def hide(filename, message, target):
	img = Image.open(filename)
	binary = utilities.str2bin(message) + utilities.delimiter
	if img.mode in ('RGBA'):
		img = img.convert('RGBA')
		pixels = img.getdata()
		data = []
		digit = 0
		for pixel in pixels:
			if (digit < len(binary)):
				hexcode = utilities.rgb2hex(pixel[0], pixel[1], pixel[2])
				new_hex = utilities.encode(hexcode, binary[digit])
				if new_hex is None:
					data.append(pixel)
				else:
					new_pixel = utilities.hex2rgb(new_hex)
					data.append(new_pixel + (255,))
					digit+=1
			else:
				data.append(pixel)
		img.putdata(data)
		img.save(target, 'PNG')


hide('dog.png', 'Ahmed Magdy', 'hidden.png')
