import json
    
with open('lb_url.txt', 'r') as f:
    new_url = f.readlines()[0][1:-3]
# new_url.replace("'","")

print(new_url)
    


with open('terraform-rest-end-points.postman_collection.json') as f:
    collection = json.load(f)   


for item in collection['item']:
    # Extract the raw URL and endpoint from the request
    raw_url = item['request']['url']['raw']
    endpoint = raw_url.split('/', 3)[-1].strip()
    
    # Replace the base URL with the new one
    new_base_url = new_url.strip() + '/' + endpoint
    
    # Update the request with the new URL
    item['request']['url']['raw'] = new_base_url

# Save the updated collection to a new JSON file
with open('rest-endpoints-new.json', 'w') as f:
    json.dump(collection, f)

