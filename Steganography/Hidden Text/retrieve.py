from PIL import Image
import utilities

def retrieve(filename):
	img = Image.open(filename)
	binary = ''
	if img.mode in ('RGBA'):
		img = img.convert('RGBA')
		pixels = img.getdata()
		for pixel in pixels:
			hexcode = utilities.rgb2hex(pixel[0], pixel[1], pixel[2])
			digit = utilities.decode(hexcode)
			if digit != None:
				binary = binary + digit
				if binary[-16:] == utilities.delimiter:
					text = utilities.bin2str(binary[:-16])
					return text


print(retrieve('hidden.png'))
