from PIL import Image
import utilities


def hide(filename, message, target):

    img = Image.open(filename)

    # generate key pairs and output public key to the current directory
    key = utilities.generate_rsa(1024)

    # encrypt message with public key, output type tuple, tuple[0] type is byte
    encrypted_message = utilities.encrypt_message(key, message)

    # binary = utilities.str2bin(message) + utilities.delimiter
    binary = utilities.bytes2bin(encrypted_message[0]) + utilities.delimiter
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


hide(
    'dog.png',
    'There are two ways to write error-free programs; only the third one works.',
    'hidden.png')
