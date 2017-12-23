import binascii
from Crypto.PublicKey import RSA
from Crypto import Random

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

def bytes2bin(e_msg):
    int_msg = int.from_bytes(e_msg, byteorder='big')
    binary = bin(int_msg)
    return binary[2:]

def bin2str(binary):
    msg = binascii.unhexlify('%x' % (int('0b' + binary, 2)))
    return msg

def encode(hexcode, digit):
    if hexcode[-1] in ('0', '1', '2', '3', '4', '5'):
        hexcode = hexcode[:-1] + digit
        return hexcode
    return None

def decode(hexcode):
    if hexcode[-1] in ('0', '1'):
        return hexcode[-1]
    return None

def generate_rsa(key_size):
	random_generator = Random.new().read
	key = RSA.generate(key_size, random_generator)
	# export private key
	exported = key.exportKey(format='PEM')
	f = open('private.pem', 'wb')
	f.write(exported)
	return key

def encrypt_message(key, str_msg):
    public_key = key.publickey()
    encrypted_message = public_key.encrypt(str_msg.encode(),32)
    return encrypted_message

def decrypt_message(private_key_name, encrypted_message):
	f = open(private_key_name, 'rb')
	private_key = f.read()
	key = RSA.importKey(private_key)
	return key.decrypt(encrypted_message)
