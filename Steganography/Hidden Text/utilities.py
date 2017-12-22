import binascii

delimiter = '1111111111111110'

def rgb2hex(red, green, blue):
	return '#{:02x}{:02x}{:02x}'.format(red, green, blue)

def hex2rgb(hexcode):
	hexcode = hexcode[1:]
	red = hexcode[0:2]
	green = hexcode[2:4]
	blue = hexcode[4:6]
	return (int(red, 16), int(green, 16), int(blue, 16))

def str2bin(msg):
	binary = bin(int(binascii.hexlify(msg.encode('ASCII')), 16))
	return binary[2:]

def bin2str(binary):
	msg = binascii.unhexlify('%x' % (int('0b' + binary, 2)))
	return msg.decode('ASCII')

def encode(hexcode, digit):
	if hexcode[-1] in ('0', '1', '2', '3', '4', '5'):
		hexcode = hexcode[:-1] + digit
		return hexcode
	return None

def decode(hexcode):
	if hexcode[-1] in ('0', '1'):
		return hexcode[-1]
	return None
