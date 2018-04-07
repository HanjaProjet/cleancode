	/**
	 * getUuid
	 *
	 * @return
	 */
	public String getUuid() {
		if (WorkspaceComunicator.getSelectedWorkspace() == UIDockPanelConstants.DESKTOP) {
			switch (selectedPanel) {
				case TAB_DOCUMENT:
					return TabDocumentComunicator.getDocument().getUuid();

				case TAB_FOLDER:
					return TabFolderComunicator.getFolder().getUuid();

				case TAB_MAIL:
					return TabMailComunicator.getMail().getUuid();

				default:
					return null;
			}
		} else {
			return null;
		}
	}
	
	