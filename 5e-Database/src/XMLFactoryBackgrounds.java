import org.json.JSONArray;
import org.json.JSONObject;

public class XMLFactoryBackgrounds {
	private String name;
	private int index;
	private int skillproficienciesChoose;
	private String[] skillproficiencies;
	private int weaponproficienciesChoose;
	private String[] weaponproficiencies;
	private int toolproficienciesChoose;
	private String[] toolproficiencies;
	private int languagesChoose;
	private String[] languages;
	private String[] equipment;
	private int descChoose;
	private String[] descNames;
	private String[] desc;

	public XMLFactoryBackgrounds() {

	}

	public XMLFactoryBackgrounds(String name, int index, int skillproficienciesChoose, String[] skillproficiencies,
			int weaponproficienciesChoose, String[] weaponproficiencies, int toolproficienciesChoose,
			String[] toolproficiencies, int languagesChoose, String[] languages, String[] equipment, int descChoose,
			String[] descNames, String[] desc) {
		super();
		this.name = name;
		this.index = index;
		this.skillproficienciesChoose = skillproficienciesChoose;
		this.skillproficiencies = skillproficiencies;
		this.weaponproficienciesChoose = weaponproficienciesChoose;
		this.weaponproficiencies = weaponproficiencies;
		this.toolproficienciesChoose = toolproficienciesChoose;
		this.toolproficiencies = toolproficiencies;
		this.languagesChoose = languagesChoose;
		this.languages = languages;
		this.equipment = equipment;
		this.descChoose = descChoose;
		this.descNames = descNames;
		this.desc = desc;
	}

	private JSONObject JSONdesc() {
		JSONObject jsonDesc = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;

		if (desc.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < desc.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("name", descNames[i]);
				jsonCache.put("desc", desc[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonDesc.put("choose", descChoose);
			jsonDesc.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonDesc;
	}
	public JSONObject JSONdesc(String[] descNames, String[]desc) {
		JSONObject jsonDesc = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;

		if (desc.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < desc.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("name", descNames[i]);
				jsonCache.put("desc", desc[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonDesc.put("choose", descChoose);
			jsonDesc.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonDesc;
	}

	private JSONObject JSONequipment() {
		JSONObject jsonEquipment = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;

		if (equipment.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < equipment.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("item", equipment[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonEquipment.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonEquipment;
	}

	private JSONObject JSONlanguage() {
		JSONObject jsonLanguage = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;
		if (languages.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < languages.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("name", languages[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonLanguage.put("choose", languagesChoose);
			jsonLanguage.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonLanguage;
	}

	public JSONObject JSONtoolproficiency() {
		JSONObject jsonToolproficiencies = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;
		if (toolproficiencies.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < toolproficiencies.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("name", toolproficiencies[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonToolproficiencies.put("choose", toolproficienciesChoose);
			jsonToolproficiencies.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonToolproficiencies;
	}

	public JSONObject JSONweaponproficiency() {
		JSONObject jsonWeaponproficiencies = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;
		if (weaponproficiencies.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < weaponproficiencies.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("name", weaponproficiencies[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonWeaponproficiencies.put("choose", weaponproficienciesChoose);
			jsonWeaponproficiencies.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonWeaponproficiencies;
	}

	private JSONObject JSONskillproficiency() {
		JSONObject jsonSkillproficiencies = new JSONObject();
		JSONArray jsonArrayCache;
		JSONObject jsonCache;
		if (skillproficiencies.length > 0) {
			jsonArrayCache = new JSONArray();
			for (int i = 0; i < skillproficiencies.length; i++) {
				jsonCache = new JSONObject();
				jsonCache.put("name", skillproficiencies[i]);
				jsonArrayCache.put(jsonCache);
			}
			jsonSkillproficiencies.put("choose", skillproficienciesChoose);
			jsonSkillproficiencies.put("from", jsonArrayCache);
			jsonArrayCache = null;
			jsonCache = null;
		}
		return jsonSkillproficiencies;
	}

	public String GetJSON() {
		JSONObject jsonString = new JSONObject();
		JSONObject jsonDesc = JSONdesc();
		if (!jsonDesc.isEmpty()) {
			jsonString.put("desc", jsonDesc);
		}

		JSONObject jsonEquipment = JSONequipment();
		if (!jsonEquipment.isEmpty()) {
			jsonString.put("equipment", jsonEquipment);
		}

		JSONObject jsonLanguage = JSONlanguage();
		if (!jsonLanguage.isEmpty()) {
			jsonString.put("language", jsonLanguage);
		}

		JSONObject jsonToolproficiencies = JSONtoolproficiency();
		if (!jsonToolproficiencies.isEmpty()) {
			jsonString.put("tool_proficiency", jsonToolproficiencies);
		}

		JSONObject jsonWeaponproficiencies = JSONweaponproficiency();
		if (!jsonWeaponproficiencies.isEmpty()) {
			jsonString.put("weapon_proficiency", jsonWeaponproficiencies);
		}

		JSONObject JSONskillproficiency = JSONskillproficiency();
		if (!JSONskillproficiency.isEmpty()) {
			jsonString.put("skill_proficiency", JSONskillproficiency);
		}

		jsonString.put("index", index);
		jsonString.put("name", name);

		return jsonString.toString();
	}
}
