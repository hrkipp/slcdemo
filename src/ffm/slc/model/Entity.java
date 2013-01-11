package ffm.slc.model;

import ffm.slc.model.resources.UuidType;

public class Entity {

	private BasicLink[] links;
	private UuidType id;

	public BasicLink[] getLinks() {
		return links;
	}

	public void setLinks(BasicLink[] links) {
		this.links = links;
	}

	public String getLink(String rel){
		for(BasicLink link : links){
			if(link.getRel().equals(rel)){
				return link.getHref();
			}
		}
		return null;
	}

	public UuidType getId() {
		return id;
	}

	public void setId(UuidType id) {
		this.id = id;
	}
}